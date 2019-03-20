package com.weimob.ec.handaop.invocation;

import org.aopalliance.intercept.MethodInvocation;

public interface ProxyMethodInvocation extends MethodInvocation {

  /**
   * 获取代理
   * @return
   */
  Object getProxy();

}
