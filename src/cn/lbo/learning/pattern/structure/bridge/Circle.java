package cn.lbo.learning.pattern.structure.bridge;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:00
 * @PackageName:cn.lbo.learning.pattern.structure.bridge
 * @ClassName: Circle
 * @Description: TODO
 * @Version 1.0
 */
public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("apply color");
        color.applyColor();
    }
}
