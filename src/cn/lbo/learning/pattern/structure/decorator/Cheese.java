package cn.lbo.learning.pattern.structure.decorator;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:29
 * @PackageName:cn.lbo.learning.pattern.structure.decorator
 * @ClassName: Cheese
 * @Description: 具体装饰器
 * @Version 1.0
 */
public class Cheese extends ToppingDesorator{

    public Cheese(Pizza tempPizza) {
        super(tempPizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.5;
    }
}
