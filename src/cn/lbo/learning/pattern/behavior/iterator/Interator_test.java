package cn.lbo.learning.pattern.behavior.iterator;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:40
 * @PackageName:cn.lbo.learning.pattern.behavior.iterator
 * @ClassName: Interator_test
 * @Description: 迭代器模式
 * Java迭代器模式是一种行为设计模式，它提供了一种访问集合对象元素的方法，而不需要暴露该对象的内部表示。
 * 该模式适用于需要遍历集合对象的场景，例如数组、列表、树等。
 * @Version 1.0
 */
public class Interator_test {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};

        Interator<Integer> interator = new ArrayInterator<>(array);
        while (interator.hasNext()) {
            System.out.println(interator.next());
        }
    }
}
