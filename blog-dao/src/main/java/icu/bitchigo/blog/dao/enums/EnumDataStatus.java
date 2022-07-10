package icu.bitchigo.blog.dao.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumDataStatus {

    NORMAL(0,"正常"),
    DELETED(-1,"已删除")
    ;

    private final Integer code;
    private final String description;
}
