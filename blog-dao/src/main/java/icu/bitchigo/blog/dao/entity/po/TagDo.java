package icu.bitchigo.blog.dao.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("blog_tag")
public class TagDo {
    private Long id;
    private String name;
    private Integer status;
}
