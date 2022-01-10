package com.example.demo.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class ResponseVo<T> {
    private String statusCode;
    private String message;
    private T data;

    public static <T> ResponseVo<T> success(T data) {
        ResponseVo<T> vo = new ResponseVo<>();
        vo.setStatusCode("200");
        vo.setMessage("success");
        vo.setData(data);
        return vo;
    }
    public static <T> ResponseVo<T> failed(T data) {
        ResponseVo<T> vo = new ResponseVo<>();
        vo.setStatusCode("400");
        vo.setMessage("error");
        vo.setData(data);
        return vo;
    }
}
