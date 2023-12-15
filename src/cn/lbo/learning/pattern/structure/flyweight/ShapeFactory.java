package cn.lbo.learning.pattern.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:40
 * @PackageName:cn.lbo.learning.pattern.structure.flyweight
 * @ClassName: ShapeFactory
 * @Description: 享元工厂类
 * @Version 1.0
 */
public class ShapeFactory {

    private static final Map<String,Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String color){
        Shape shape = shapeMap.get(color);
        if(shape == null){
            shape = new Circle(color);
            shapeMap.put(color,shape);
            System.out.println("create circle: color: " + color);
        }
        return shape;
    }

}
