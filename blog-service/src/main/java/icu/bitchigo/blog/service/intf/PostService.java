package icu.bitchigo.blog.service.intf;

import icu.bitchigo.blog.dao.entity.bo.PostBo;
import icu.bitchigo.blog.dao.entity.po.PostDo;

import java.util.List;

public interface PostService {
    void updatePostById(PostDo post);

    List<PostBo> selectPostList(int offset, int size);

    List<Long> sleectIdList();

}
