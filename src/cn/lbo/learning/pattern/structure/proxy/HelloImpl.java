package cn.lbo.learning.pattern.structure.proxy;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:47
 * @PackageName:cn.lbo.learning.pattern.structure.proxy
 * @ClassName: HelloImpl
 * @Description: TODO
 * @Version 1.0
 */
public class HelloImpl implements IHello {

    @Override
    public String hi(String name) {
        return "hi " + name;
    }
}
