package icu.bitchigo.blog.dao.intf;


import icu.bitchigo.blog.dao.entity.bo.PostBo;
import icu.bitchigo.blog.dao.entity.po.PostDo;

import java.util.List;

public interface PostDao {
    void updatePostById(PostDo post);

    List<PostBo> selectPostList(int offset, int size);

    PostBo selectPostById(Long id);

    List<Long> sleectIdList();

}
