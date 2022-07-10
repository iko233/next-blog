package icu.bitchigo.blog.dao.entity.po;

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
public class TagQuoteDo {
    private Long id;
    private Long tagId;
    private String tagName;
    private Long postId;
    private Integer status;
}
