package icu.bitchigo.blog.vo;

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
public class PostVo {
    private Long id;
    private Long userId;
    private String userName;
    private List<TagVo> tagList;
    private ClassifyVo classifyList;
    private String title;
    private String content;
    private Date createTime;
    private Date updateTime;
    private Integer status;
}
