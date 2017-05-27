package com.wisely.highlight_spring4.chi1.di.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * <p>Description: 编写切面</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: 中视数讯</p>
 * <p>Site: www.digi-zones.com</p>
 *
 * @author shengping
 * @version 1.0
 * @date 2017/5/24
 */
//1 通过@Aspect注解声明一个切面
//2 通过@Component让此切面成为spring容器管理的Bean
//3 通过@PointCut注解声明切点
//4 通过@after注解声明一个建言，并使用@PointCut定义的切点
//5 通过反射可获得注解上的属性，然后做日志记录相关操作
//6 通过before注解声明一个建言，次建言直接使用拦截规则作为参数
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.wisely.highlight_spring4.chi1.di.aop.Action)")
    public void annotationPointCut(){}

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.name());

        System.out.println("注解式拦截"+action.getClass());
    }

    @Before("execution(*com.wisely.highlight_spring4.chi1.di.aop)")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截"+method.getName());
    }

}
