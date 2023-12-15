package cn.lbo.learning.pattern.structure.decorator;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:27
 * @PackageName:cn.lbo.learning.pattern.structure.decorator
 * @ClassName: ToppingDesorator
 * @Description: 装饰器
 * @Version 1.0
 */
public abstract class ToppingDesorator implements Pizza {

    protected Pizza tempPizza;

    public ToppingDesorator(Pizza tempPizza) {
        this.tempPizza = tempPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
