package icu.bitchigo.blog.service.impl;

import icu.bitchigo.blog.dao.entity.bo.PostBo;
import icu.bitchigo.blog.dao.entity.po.PostDo;
import icu.bitchigo.blog.dao.intf.PostDao;
import icu.bitchigo.blog.service.intf.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostDao postDao;

    @Override
    public void updatePostById(PostDo post) {
        postDao.updatePostById(post);
    }

    @Override
    public List<PostBo> selectPostList(int offset, int size) {
        return postDao.selectPostList(offset,size);
    }

    @Override
    public List<Long> sleectIdList() {
        return postDao.sleectIdList();
    }
}
