package cn.lbo.learning.pattern.structure.flyweight;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:38
 * @PackageName:cn.lbo.learning.pattern.structure.flyweight
 * @ClassName: Circle
 * @Description: 具体享元类
 * @Version 1.0
 */
public class Circle implements Shape {

    private String color;

    private int x;

    private int y;

    private int radius;

    public Circle(String color){
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("draw circle: color: " + color + ", x: " + x + ", y: " + y + ", radius: " + radius);
    }
}
