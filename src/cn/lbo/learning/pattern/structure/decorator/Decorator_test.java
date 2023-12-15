package cn.lbo.learning.pattern.structure.decorator;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:22
 * @PackageName:cn.lbo.learning.pattern.structure.decorator
 * @ClassName: Decorator_test
 * @Description: 装饰器模式
 * 装饰器模式是一种结构性设计模式，它允许您在不影响同一类的其他对象的行为的情况下，静态或动态地向单个对象添加行为。
 * 当您想要在运行时添加或删除对象的功能时，或者当您想要减少创建不同行为组合所需的子类数量时，此模式非常有用。
 *
 * 装饰器模式适用于以下场景：
 * 1.在不修改现有代码的情况下，向现有类添加新的功能。
 * 2.在运行时动态地向对象添加新的行为。
 * 3.以不同的方式组合对象，以实现不同的行为。
 *
 * 使用装饰器模式时需要注意以下几点：
 * 1.装饰器类需要实现与被装饰对象相同的接口，以便可以对被装饰对象进行包装。
 * 2.装饰器类应该在调用被装饰对象的方法之前或之后添加新的行为。
 * 3.不要创建过多的装饰器对象，否则会导致代码变得复杂难以维护。
 * @Version 1.0
 */
public class Decorator_test {

    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new Pepperoni(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
