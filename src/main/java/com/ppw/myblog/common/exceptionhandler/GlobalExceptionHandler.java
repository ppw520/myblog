package com.ppw.myblog.common.exceptionhandler;

import com.ppw.myblog.common.basic.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    private Result Handle(){
        return null;
    }
}
