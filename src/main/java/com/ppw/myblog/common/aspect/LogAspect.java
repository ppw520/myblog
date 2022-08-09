package com.ppw.myblog.common.aspect;

import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Log4j2
public class LogAspect {

    @Pointcut("@annotation(com.ppw.myblog.common.annotation.LogAnnotation)")
    public void LogAnnotation() {

    }

    @Around("LogAnnotation()")
    public Object eagleEyeAround(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("方法开始");
        long beginTime = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        log.info("方法结束");
        long time = System.currentTimeMillis() - beginTime;
        System.out.println(time);
        System.out.println("花费"+time/1000.00+"s");
        return proceed;
    }
}
