package com.wanan.holmes.domain;

import java.io.Serializable;

/**
 * @author teng.hao
 * Created by Intellij IDEA
 * Date 18/1/14
 * Time 下午8:14
 */
public class HolmesHttpResult<T> implements Serializable {
    private static final Long serialVersionUID = 1L;
    private Integer code=200;
    private String msg;
    private T data;

    HolmesHttpResult(Integer code,String msg,T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    HolmesHttpResult(){

    }

    public static<R> HolmesHttpResult<R> successResult(R result){
        HolmesHttpResult<R> holmesHttpResult = new HolmesHttpResult<R>();
        holmesHttpResult.setCode(200);
        holmesHttpResult.setMsg("success");
        holmesHttpResult.setData(result);
        return holmesHttpResult;
    }

    public static<R>HolmesHttpResult<R> errorResult(R result){
        HolmesHttpResult<R> holmesHttpResult = new HolmesHttpResult<R>();
        holmesHttpResult.setCode(200);
        holmesHttpResult.setMsg("fail");
        holmesHttpResult.setData(result);
        return holmesHttpResult;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
