package cn.lbo.learning.pattern.build.factory.abstract_factory;

/**
 * @Author bjliubo
 * @Date 2023/12/15 11:51
 * @PackageName:cn.lbo.learning.pattern.build.factory.abstract_factory
 * @ClassName: CatFactory
 * @Description: TODO
 * @Version 1.0
 */
public class CatFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
