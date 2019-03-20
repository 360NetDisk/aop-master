package com.weimob.ec.bean;

/**
 * @author hui.xu
 * @description
 * @date 2018-09-18 23:30
 */
public class NavieWaiter implements Waiter {
    @Override
    public void greetTo(String clientName) {
        System.out.println("NavieWaiter : greeter to" + clientName + "...");

    }

    @Override
    public void serverTo(String clientName) {
        System.out.println("NavieWaiter : servering to " + clientName + "...");

    }
}
