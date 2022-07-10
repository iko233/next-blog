package icu.bitchigo.blog.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

/**
 * 响应模板
 *
 * @author bitchigo
 * @date 2022/06/12
 */
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {
    private Integer code;
    private String message;
    private T data;

    public static Response<Empty> build(EnumResponseCode code){
        return build(code,code.getMessage());
    }

    public static Response<Empty> build(EnumResponseCode code, String message){
        return Response.<Empty>builder()
                .data(null)
                .code(code.getCode())
                .message(message)
                .build();
    }

    public static <T> Response<T> build(T data, EnumResponseCode code){
        return build(data,code,code.getMessage());
    }

    public static <T> Response<T> build(T data, EnumResponseCode code, String message){
        return Response.<T>builder()
                .data(data)
                .code(code.getCode())
                .message(message)
                .build();
    }

}
