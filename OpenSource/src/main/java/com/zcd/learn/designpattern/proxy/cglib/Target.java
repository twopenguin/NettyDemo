package com.zcd.learn.designpattern.proxy.cglib;

/**
 * need to enhancer(需要加强的类)
 */
public class Target {
    /**
     * the method need to enhancer(需要加强的方法)
     */
    public void doSomething() {
        System.out.println("doSomething ------------");
    }
}
