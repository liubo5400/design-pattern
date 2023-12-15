package cn.lbo.learning.pattern.structure.decorator;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:30
 * @PackageName:cn.lbo.learning.pattern.structure.decorator
 * @ClassName: Pepperoni
 * @Description: 具体装饰器
 * @Version 1.0
 */
public class Pepperoni extends ToppingDesorator{

    public Pepperoni(Pizza tempPizza) {
        super(tempPizza);
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1.0;
    }
}
