package cn.lbo.learning.pattern.build.builder;

/**
 * @Author bjliubo
 * @Date 2023/12/15 11:52
 * @PackageName:cn.lbo.learning.pattern.build.builder
 * @ClassName: builder_test
 * @Description: 建造者模式
 * 建造者模式是一种创建型设计模式，它允许您通过一步一步地构建复杂对象来创建不同类型的对象。
 * 它使用一个建造者类来封装对象的创建过程并将其分解为多个简单的步骤。这使得您可以通过更改这些步骤来创建不同类型的对象。
 * @Version 1.0
 */
public class builder_test {

    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.setEngine("1");
        carBuilder.setMake("1");
        carBuilder.setModel("1");
        carBuilder.setSeats(5);
        carBuilder.setYear(1);
        Car car = carBuilder.build();
        System.out.println(car);
    }
}
