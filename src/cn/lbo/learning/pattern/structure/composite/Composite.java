package cn.lbo.learning.pattern.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:13
 * @PackageName:cn.lbo.learning.pattern.structure.composite
 * @ClassName: Composite
 * @Description: TODO
 * @Version 1.0
 */
public class Composite extends Component {

    private List<IComponent> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(IComponent component) {
        children.add(component);
    }

    @Override
    public void remove(IComponent component) {
        children.remove(component);
    }

    @Override
    public void display() {
        System.out.println(name);
        for (IComponent component : children) {
            component.display();
        }
    }
}
