package icu.bitchigo.blog.dao.entity.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class PostBo {
    private Long id;
    private Long userId;
    private String userName;
    private List<TagBo> tagList;
    private ClassifyBo classifyList;
    private String title;
    private String content;
    private Date createTime;
    private Date updateTime;
    private Integer status;
}
