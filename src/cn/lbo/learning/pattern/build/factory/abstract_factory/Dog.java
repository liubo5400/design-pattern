package cn.lbo.learning.pattern.build.factory.abstract_factory;

/**
 * @Author bjliubo
 * @Date 2023/12/15 11:49
 * @PackageName:cn.lbo.learning.pattern.build.factory.abstract_factory
 * @ClassName: Dog
 * @Description: TODO
 * @Version 1.0
 */
public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void sleep() {
        System.out.println("狗睡觉");
    }

    @Override
    public void run() {
        System.out.println("狗跑");
    }
}
