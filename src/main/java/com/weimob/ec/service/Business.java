package com.weimob.ec.service;

import com.weimob.ec.annotation.Monitor;
import org.springframework.stereotype.Component;

/**
 * @author hui.xu
 * @description
 * @date 2018-09-18 23:43
 */
@Component
@Monitor
public class Business {
    public void dealBusinessOne(){
        System.out.println("deal bussinessOne executed");

    }

    public void dealBusinessTwo(){
        System.out.println("deal bussinessTeo executed");

    }

}
