package icu.bitchigo.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import icu.bitchigo.blog.dao.entity.po.ClassifyDo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ClassifyMapper extends BaseMapper<ClassifyDo> {
}
