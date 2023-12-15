package cn.lbo.learning.pattern.build.factory.abstract_factory;

/**
 * @Author bjliubo
 * @Date 2023/12/15 11:48
 * @PackageName:cn.lbo.learning.pattern.build.factory.abstract_factory
 * @ClassName: AbstractFactory_test
 * @Description: 抽象工厂模式
 * 通过定义一个创建对象的接口来创建对象，但将具体实现的决定留给子类来决定。
 * 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
 * @Version 1.0
 */
public class AbstractFactory_test {

    public static void main(String[] args) {
        AnimalFactory catFactory = new CatFactory();
        AnimalFactory dogFactory = new DogFactory();
        Animal cat = catFactory.createAnimal();
        Animal dog = dogFactory.createAnimal();
        cat.eat();
        cat.run();
        cat.sleep();
        dog.eat();
        dog.run();
        dog.sleep();
    }
}
