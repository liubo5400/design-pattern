package cn.lbo.learning.pattern.structure.proxy;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:44
 * @PackageName:cn.lbo.learning.pattern.structure.proxy
 * @ClassName: Proxy_test
 * @Description: 代理模式
 * 代理模式是项目中常用的一种设计模式。提供了间接访问目标对象的一种方式；即通过代理对象访问目标对象。
 * 这样做的好处是，可以在不改变原有目标对象的基础上，对目标对象增加额外的扩展功能。
 * 代理模式又分为静态代理、jdk动态代理、cglib动态代理三种实现方式。
 *
 * 三种实现方式各有优点，以及适用的场景：
 * 1.静态代理：代理类必须非常明确，所以无法做到通用，但是效率也是最高的
 * 2.jdk动态代理：必须基于接口代理，有一定局限性；动态生成字节码文件，可以用于通用业务（性能日志等）
 * 3.cglib动态代理：也是动态生成字节码文件，生成的代理类继承了目标对象
 * 4.spring aop默认代理策略是：如果目标对象实现了接口，则使用jdk动态代理，否则使用cglib代理
 * 5.jdk8之后，jdk动态代理效率要高于cglib代理
 *
 * @Version 1.0
 */
public class Proxy_test {

    public static void main(String[] args) {
        HelloStaticProxy helloProxy = new HelloStaticProxy(new HelloImpl());
        System.out.println(helloProxy.hi("lbo"));

        System.out.println("====================================");

        HelloJDKProxy helloJDKProxy = new HelloJDKProxy(new HelloImpl());
        IHello hello = helloJDKProxy.getProxy();
        System.out.println(hello.hi("lbo"));

//        System.out.println("====================================");
//        HelloImpl hello1 = new HelloImpl();
//        HelloImpl proxy = HelloCglibProxy.getProxy(hello1.getClass());
//        System.out.println(proxy.hi("lbo"));
    }
}
