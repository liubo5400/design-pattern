package cn.lbo.learning.pattern.structure.composite;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:12
 * @PackageName:cn.lbo.learning.pattern.structure.composite
 * @ClassName: Component
 * @Description: TODO
 * @Version 1.0
 */
public abstract class Component implements IComponent {

    protected String name;

    public Component(String name){
        this.name = name;
    }

    public abstract void add(IComponent component);

    public abstract void remove(IComponent component);
}
