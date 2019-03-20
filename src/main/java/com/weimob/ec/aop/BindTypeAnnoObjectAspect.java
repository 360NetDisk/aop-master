package com.weimob.ec.aop;

import com.weimob.ec.annotation.Monitor;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author hui.xu
 * @description
 * @date 2018-09-18 23:55
 */
@Aspect
public class BindTypeAnnoObjectAspect {

    @Before("@within(m)")
    public void bindTypeAnnotation(Monitor m){
        System.out.println("----bindTypeAnnoObject()----");
        System.out.println(m.getClass().getName());
        System.out.println("----bindTypeAnnoObject()----");

    }
}
