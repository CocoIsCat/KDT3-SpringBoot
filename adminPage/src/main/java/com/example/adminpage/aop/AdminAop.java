package com.example.adminpage.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Component
@Aspect
public class AdminAop {

    @Pointcut("execution(* com.example.adminpage.controller.*ListController.*(..))" +
            "|| execution(* com.example.adminpage.controller.IndexController.*(..))" +
            "|| execution(* com.example.adminpage.controller.PaymentController.*(..))")
    public void cut() {}

    @Around("cut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession();

        if(session.getAttribute("email") == null) {
            return null;
        }
        else {
            return joinPoint.proceed();
        }
    }


}
