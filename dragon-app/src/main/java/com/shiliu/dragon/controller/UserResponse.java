package com.shiliu.dragon.controller;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;

/**
 * 用户注册，修改相关响应信息
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum UserResponse implements Serializable {

    INVALIDMOBILE(2001,"Invalid mobile"),
    PASSWORD_REPEAT(2002,"Passwords are diff"),
    PASSWORD_RULE_NOTSATISFIED(2003,"Password rules not satisfied"),
    USERNAME_ISEMPTY(2004,"Username invalid"),
    SCHOOL_MAJOR_EMPTY(2005,"Scholl or major can not empty"),
    MOBILE_REGISTED(2006,"Mobile has registed"),
    REGISTER_SUCCESS(2008,"Register success"),
    UPDATE_SUCCESS(2031,"Update user success"),
    UPDATE_PWD(2032,"Update pwd success"),
    USER_NOT_EXIST(2021,"User not exist"),
    QUERY_USER_SUCCESS(2022,"QueyUser success");

    UserResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}