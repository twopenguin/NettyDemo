package com.zcd.learn.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by admin on 2017/8/2.
 */
public class TargetFactory {

    /**
     * 生成被加强后的类的实例
     * @param proxy 具体如何加强
     * @return
     */
    public static Target getInstance(CglibProxy proxy) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Target.class);
        //回调方法的参数为代理类对象CglibProxy，最后增强目标类调用的是代理类对象CglibProxy中的intercept方法
        enhancer.setCallback(proxy);
        // 此刻，base不是单纯的目标类，而是增强过的目标类
        Target base = (Target) enhancer.create();
        System.out.println("被增强过的类：" + base);
        return base;
    }

}
