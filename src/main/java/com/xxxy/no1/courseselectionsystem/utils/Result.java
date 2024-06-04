package com.xxxy.no1.courseselectionsystem.utils;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//统一响应结果
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Result<T> {
    private Integer code;//业务状态码  0-成功  1-失败
    private String msg;
    private int count;
    private T data;//响应数据

    //快速返回操作成功响应结果(带响应数据)
    public static <E> Result<E> success(E data) {
        return new Result<>(0, "操作成功",1000,data);
    }

    //快速返回操作成功响应结果
    public static Result success() {
        return new Result(0, "操作成功", 1000, null);
    }

    public static Result error(String message) {
        return new Result(1, message,0, null);
    }
}
