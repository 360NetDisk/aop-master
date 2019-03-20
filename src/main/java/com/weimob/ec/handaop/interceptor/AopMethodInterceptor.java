package com.weimob.ec.handaop.interceptor;

import org.aopalliance.intercept.MethodInvocation;

/**
 * aop容器所有拦截器都时限的接口
 * @author hui.xu
 * @description
 * @date 2018-11-17 00:44
 */
public interface AopMethodInterceptor {

  Object invoke(MethodInvocation methodInvocation);

}
