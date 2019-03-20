package com.weimob.ec;

import com.weimob.ec.service.Business;
import org.junit.jupiter.api.Test;
import org.omg.CORBA.CTX_RESTRICT_SCOPE;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hui.xu
 * @description
 * @date 2018-09-18 23:28
 */
public class TestApp {

    @Test
    public void test(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Business business = context.getBean("business", Business.class);
        business.dealBusinessOne();

    }
}
