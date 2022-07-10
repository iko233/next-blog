package icu.bitchigo.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import icu.bitchigo.blog.dao.entity.po.TagDo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TagMapper extends BaseMapper<TagDo> {
}
