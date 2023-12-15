package cn.lbo.learning.pattern.structure.flyweight;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:36
 * @PackageName:cn.lbo.learning.pattern.structure.flyweight
 * @ClassName: Flyweight_test
 * @Description: 享元模式
 * 享元模式（Flyweight Pattern）是一种结构型设计模式，它通过共享对象来减少内存使用和对象创建的开销。
 * 享元模式属于对象型模式，它通过创建一个享元工厂来管理共享对象，并在需要时返回已经存在的对象，从而减少对象的创建和销毁次数。
 * @Version 1.0
 */
public class Flyweight_test {

    private static final String[] colors = { "红色", "绿色", "蓝色", "黄色", "黑色" };

    public static void main(String[] args) {
        for(int i=0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getShape(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }
    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

}
