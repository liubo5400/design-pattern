package cn.lbo.learning.pattern.structure.bridge;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:58
 * @PackageName:cn.lbo.learning.pattern.structure.bridge
 * @ClassName: Shape
 * @Description: TODO
 * @Version 1.0
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}
