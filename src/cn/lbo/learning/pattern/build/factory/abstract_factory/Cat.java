package cn.lbo.learning.pattern.build.factory.abstract_factory;

/**
 * @Author bjliubo
 * @Date 2023/12/15 11:50
 * @PackageName:cn.lbo.learning.pattern.build.factory.abstract_factory
 * @ClassName: Cat
 * @Description: TODO
 * @Version 1.0
 */
public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫睡觉");
    }

    @Override
    public void run() {
        System.out.println("猫跑");
    }
}
