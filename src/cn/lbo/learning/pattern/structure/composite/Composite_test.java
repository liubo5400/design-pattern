package cn.lbo.learning.pattern.structure.composite;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:15
 * @PackageName:cn.lbo.learning.pattern.structure.composite
 * @ClassName: Composite_test
 * @Description: 组合模式
 * 组合模式是一种结构型设计模式，它允许你将对象组合成树形结构以表示“部分-整体”的层次结构。这种模式使得客户端可以统一对待单个对象和对象组合。
 * @Version 1.0
 */
public class Composite_test {

    public static void main(String[] args) {
        Component root = new Composite("root");
        Component branch1 = new Composite("branch1");
        Component branch2 = new Composite("branch2");
        Leaf leaf3 = new Leaf("leaf3");
        Leaf leaf4 = new Leaf("leaf4");
        Leaf leaf5 = new Leaf("leaf5");


        root.add(branch1);
        root.add(branch2);
        branch1.add(leaf3);
        branch1.add(leaf4);
        branch2.add(leaf5);

        root.display();
    }
}
