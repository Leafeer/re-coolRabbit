package com.example.coolrabbit.response;


import com.example.coolrabbit.utils.StatusEnum;
import com.example.coolrabbit.utils.StringUtil;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable{
    private String code;

    private String message;

    private T data;

    public BaseResponse() {}

    public BaseResponse(T data) {
        this.data = data;
    }

    public BaseResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResponse(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public static <T> BaseResponse<T> create(T t){
        return new BaseResponse<T>(t);
    }

    public static <T> BaseResponse<T> create(T t, StatusEnum statusEnum){
        return new BaseResponse<T>(statusEnum.getCode(), statusEnum.getMessage(), t);
    }

    public static <T> BaseResponse<T> createSuccess(T t, String message){
        return new BaseResponse<T>(StatusEnum.SUCCESS.getCode(), StringUtil.isNullOrEmpty(message) ? StatusEnum.SUCCESS.getMessage() : message, t);
    }

    public static <T> BaseResponse<T> createFail(T t, String message){
        return new BaseResponse<T>(StatusEnum.FAIL.getCode(), StringUtil.isNullOrEmpty(message) ? StatusEnum.FAIL.getMessage() : message, t);
    }

    public static <T> BaseResponse<T> create(T t, StatusEnum statusEnum, String message){

        return new BaseResponse<T>(statusEnum.getCode(), message, t);
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}

