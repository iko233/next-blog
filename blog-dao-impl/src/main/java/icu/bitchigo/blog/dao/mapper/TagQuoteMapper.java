package icu.bitchigo.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TagQuoteMapper extends BaseMapper<icu.bitchigo.blog.dao.entity.po.TagQuoteDo> {
}
