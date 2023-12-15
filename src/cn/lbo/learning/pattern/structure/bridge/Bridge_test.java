package cn.lbo.learning.pattern.structure.bridge;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:56
 * @PackageName:cn.lbo.learning.pattern.structure.bridge
 * @ClassName: Bridge_test
 * @Description: 桥接模式
 * 桥接模式是一种将抽象化和实现化解耦的设计模式。
 * 它使用了封装、聚合以及继承等基本技术，将两个独立变化的维度通过抽象化的方式进行桥接，从而降低了它们之间的耦合度，使得系统更加灵活。
 * @Version 1.0
 */
public class Bridge_test {

    public static void main(String[] args) {
        Color red = new Red();
        Color blue = new Blue();

        Shape square = new Square(red);
        square.applyColor();

        Shape circle = new Circle(blue);
        circle.applyColor();
    }
}
