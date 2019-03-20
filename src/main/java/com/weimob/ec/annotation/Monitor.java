package com.weimob.ec.annotation;

import com.sun.org.apache.xerces.internal.impl.dv.xs.BooleanDV;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author hui.xu
 * @description
 * @date 2018-09-18 23:41
 */
//声明注解的保留期限
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Monitor {

    boolean value() default  false;
}
