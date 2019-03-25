/**
 * Author: lin
 * Date: 2019/3/15 9:08
 */
package org.lucas.blog.proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

class Car{
    final void getName(){
        System.out.println("carbon");
    }

    void run(){
        System.out.println("car running");
    }


}

class CarProxy implements MethodInterceptor {

    /**
     *
     * @param o  代理对象
     * @param method 被代理对象的方法
     * @param objects 方法形参
     * @param methodProxy 代理方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //被代理方法的返回值
        Object object;
        System.out.println("ready");
        object = methodProxy.invokeSuper(o,objects);
        System.out.println("done");
        return object;
    }
}

public class CglibProxy {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Car.class);
        enhancer.setCallback(new CarProxy());
        Car carProxy = (Car)enhancer.create();
        carProxy.getName();
    }
}
