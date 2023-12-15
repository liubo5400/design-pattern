package cn.lbo.learning.pattern.structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:49
 * @PackageName:cn.lbo.learning.pattern.structure.proxy
 * @ClassName: HelloJDKProxy
 * @Description: jdk动态代理类
 * @Version 1.0
 */
public class HelloJDKProxy implements InvocationHandler {

    private Object target;

    public HelloJDKProxy(Object target) {
        this.target = target;
    }

    /**
     * 获取被代理接口实例对象
     *
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(">>> JdkProxy start");
        Object result = method.invoke(target, args);
        System.out.println(">>> JdkProxy end");
        return result;
    }
}
