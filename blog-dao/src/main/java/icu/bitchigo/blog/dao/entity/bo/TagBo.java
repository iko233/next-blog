package icu.bitchigo.blog.dao.entity.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class TagBo {
    private Long id;
    private String name;
}
