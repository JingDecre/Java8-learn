package com.example.springbase.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by decre.liao on 2018/2/3 0003.
 */
@Aspect // 声明一个切面
@Component //让此切面成为spring容器管理的bean
public class LogAspect {
    @Pointcut("@annotation(com.example.springbase.aop.Action)") //注解声明为一个切点
    public void annotationPointCut(){}

    @After("annotationPointCut()") //声明一个建言 使用定义的切点
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截 " + action.name());
    }

    @Before(value = "execution(* com.example.springbase.service.DemoMethodService.*(..))") //注解声明一个建言，此建言直接使用拦截规则作为参数,注意*号后的空格
    public void  before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截，" + method.getName());
    }
}
