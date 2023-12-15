package cn.lbo.learning.pattern.structure.proxy;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:47
 * @PackageName:cn.lbo.learning.pattern.structure.proxy
 * @ClassName: HelloStaticProxy
 * @Description: 静态代理类
 * @Version 1.0
 */
public class HelloStaticProxy implements IHello {

    private IHello hello;

    public HelloStaticProxy(IHello hello) {
        this.hello = hello;
    }

    @Override
    public String hi(String name) {
        System.out.println("before");
        String result = hello.hi(name);
        System.out.println("after");
        return result;
    }
}
