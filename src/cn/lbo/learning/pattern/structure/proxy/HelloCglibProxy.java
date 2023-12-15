package cn.lbo.learning.pattern.structure.proxy;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:53
 * @PackageName:cn.lbo.learning.pattern.structure.proxy
 * @ClassName: HelloCglibProxy
 * @Description: TODO
 * @Version 1.0
 */
public class HelloCglibProxy {

//    public static  <T> T  getProxy(Class<?> clazz) {
//        // 创建一个 Enhancer 对象。
//        Enhancer enhancer = new Enhancer();
//
//        // 设置要代理的类。
//        enhancer.setSuperclass(clazz);
//
//        // 设置代理逻辑。
//        enhancer.setCallback((MethodInterceptor) (o, method, args, methodProxy) -> {
//            System.out.println("before do something");
//
//            // 调用原始对象的方法。
//            Object result = methodProxy.invokeSuper(o, args);
//
//            System.out.println("after do something");
//
//            return result;
//        });
//
//        // 创建代理对象。
//        return (T) enhancer.create();
//    }
}
