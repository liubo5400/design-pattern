package cn.lbo.learning.pattern.structure.decorator;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:27
 * @PackageName:cn.lbo.learning.pattern.structure.decorator
 * @ClassName: PlainPizza
 * @Description: 具体组件
 * @Version 1.0
 */
public class PlainPizza implements Pizza{

    @Override
    public String getDescription() {
        return "Thin dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
