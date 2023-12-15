package cn.lbo.learning.pattern.structure.composite;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:11
 * @PackageName:cn.lbo.learning.pattern.structure.composite
 * @ClassName: Leaf
 * @Description: TODO
 * @Version 1.0
 */
public class Leaf implements IComponent {

    private String name;

    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(name);
    }
}
