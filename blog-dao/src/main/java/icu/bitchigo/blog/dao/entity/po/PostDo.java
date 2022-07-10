package icu.bitchigo.blog.dao.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("blog_post")
public class PostDo {
    private Long id;
    private Long userId;
    private Long classifyId;
    private String classifyName;
    private String title;
    private String content;
    private String markdown;
    private Date createTime;
    private Date updateTime;
    private Integer status;
}
