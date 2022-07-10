package icu.bitchigo.blog.dao.entity.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class ClassifyDo {
    private Long id;
    private String name;
    private Integer status;
}
