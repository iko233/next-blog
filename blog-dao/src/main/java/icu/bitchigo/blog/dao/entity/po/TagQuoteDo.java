package icu.bitchigo.blog.dao.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("blog_tag_quote")
public class TagQuoteDo {
    private Long id;
    private Long tagId;
    private String tagName;
    private Long postId;
    private Integer status;
}
