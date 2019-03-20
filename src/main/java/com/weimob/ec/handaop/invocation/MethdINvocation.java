package com.weimob.ec.handaop.invocation;

import org.aspectj.apache.bcel.classfile.Method;

/**
 * 作为所有方法调用的接口
 */
public interface MethdINvocation {

  /**
   * 获取方法的本身
   * @return
   */

  Method getMethod();

  /**
   * 获取方法的参数
   * @return
   */
  Object[] getOBject();

  /**
   * 执行方法本身
   * @return
   */
  Object proceed();

}
