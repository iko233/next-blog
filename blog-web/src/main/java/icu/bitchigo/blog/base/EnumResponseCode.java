package icu.bitchigo.blog.base;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumResponseCode {
    /**
     * 成功
     */
    OK(200000, "请求成功"),
    /**
     * 错误
     */
    ERROR(500000, "未知错误"),
    ;
    private final Integer code;
    private final String message;

}
