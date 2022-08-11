package com.ppw.myblog.common.basic;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    private int code;
    private String msg;
    private Object date;

    public  Result success(){
        this.setCode(20000);
        return this;
    }

    public  Result fail(){
        this.setCode(20001);
        return this;
    }

    public Result msg(@NotNull String msg){
        this.setMsg(msg);
        return this;
    }

    public Result data(@NotNull Object date){
        this.setDate(date);
        return this;
    }
}
