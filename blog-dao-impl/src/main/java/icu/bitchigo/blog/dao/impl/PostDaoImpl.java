package icu.bitchigo.blog.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import icu.bitchigo.blog.dao.entity.bo.ClassifyBo;
import icu.bitchigo.blog.dao.entity.bo.PostBo;
import icu.bitchigo.blog.dao.entity.bo.TagBo;
import icu.bitchigo.blog.dao.entity.po.PostDo;
import icu.bitchigo.blog.dao.entity.po.TagQuoteDo;
import icu.bitchigo.blog.dao.intf.PostDao;
import icu.bitchigo.blog.dao.mapper.PostMapper;
import icu.bitchigo.blog.dao.mapper.TagQuoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

import static icu.bitchigo.blog.dao.enums.EnumDataStatus.*;

@Repository
public class PostDaoImpl implements PostDao {
    @Autowired
    private PostMapper postMapper;
    @Autowired
    private TagQuoteMapper tagQuoteMapper;

    @Override
    public void updatePostById(PostDo post) {
        post.setUpdateTime(new Date());
        postMapper.updateById(post);
    }

    @Override
    public List<PostBo> selectPostList(int offset, int size) {
        List<PostDo> postDos = postMapper.selectList(new LambdaQueryWrapper<PostDo>()
                .eq(PostDo::getStatus, NORMAL.getCode())
                .last(String.format("limit %d,%d", offset, size))
        );
        List<Long> postIdList = postDos.stream()
                .map(PostDo::getId)
                .toList();
        List<TagQuoteDo> tagQuoteDos = tagQuoteMapper.selectList(new LambdaQueryWrapper<TagQuoteDo>()
                .eq(TagQuoteDo::getStatus, NORMAL.getCode())
                .in(TagQuoteDo::getPostId, postIdList));
        return postDos.stream().map(postDo -> PostBo
                .builder()
                .id(postDo.getId())
                .userId(postDo.getUserId())
                .userName("") //TODO
                .content(postDo.getContent())
                .title(postDo.getTitle())
                .updateTime(postDo.getUpdateTime())
                .createTime(postDo.getCreateTime())
                .tagList(tagQuoteDos.stream()
                        .filter(tagQuoteDo -> tagQuoteDo.getPostId().equals(postDo.getId()))
                        .map(tagQuoteDo -> TagBo.builder()
                                .id(tagQuoteDo.getTagId())
                                .name(tagQuoteDo.getTagName())
                                .build())
                        .toList()
                ).classify(
                        ClassifyBo.builder()
                                .id(postDo.getId())
                                .name(postDo.getClassifyName())
                                .build()
                )
                .build()
        ).toList();
    }

    @Override
    public PostBo selectPostById(Long id) {
        return null;
    }

    @Override
    public List<Long> sleectIdList() {
        return postMapper.selectList(new LambdaQueryWrapper<PostDo>().select(PostDo::getId))
                .stream().map(PostDo::getId)
                .toList();
    }
}
