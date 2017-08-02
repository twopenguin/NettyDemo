package com.zcd.learn.designpattern.proxy.cglib;

/**
 * Created by admin on 2017/8/2.
 */
public class Entrance {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        // base为生成的增强过的目标类
        Target  base = TargetFactory.getInstance(proxy);
        base.doSomething();
    }
}
