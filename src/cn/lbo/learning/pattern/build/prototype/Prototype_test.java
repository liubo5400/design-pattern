package cn.lbo.learning.pattern.build.prototype;

/**
 * @Author bjliubo
 * @Date 2023/12/15 11:21
 * @PackageName:cn.lbo.learning.pattern.build.prototype
 * @ClassName: Prototype_test
 * @Description: 原型模式
 * 原型设计模式允许通过复制现有对象来创建新对象，而不是通过实例化类来创建新对象。
 * 在需要创建大量相似对象时非常有用，它可以避免重复创建对象，从而提高性能，并且可以根据需要实现浅拷贝或深拷贝。
 * @Version 1.0
 */
public class Prototype_test {

    public static void main(String[] args) throws CloneNotSupportedException {
        //浅拷贝
        Sheep sheep = new Sheep("1", "羊");
        Sheep sheep1 = (Sheep) sheep.clone();
        System.out.println(sheep1);

        //深拷贝实现方式1：重写clone方法来实现深拷贝
        DeepSheep deepSheep = new DeepSheep("2", "黑羊", sheep);
        System.out.println("测试 深拷贝实现方式1：重写clone方法来实现深拷贝");
        DeepSheep deepSheep1 = (DeepSheep) deepSheep.clone();
        System.out.println(deepSheep.getSheep().hashCode());
        System.out.println(deepSheep1.getSheep().hashCode());

        //深拷贝实现方式2：通过对象的序列化实现深拷贝
        DeepSheep deepSheep2 = deepSheep.deepClone();
        System.out.println("测试 深拷贝实现方式2：通过对象序列化实现深拷贝。（推荐使用）");
        System.out.println(deepSheep.getSheep().hashCode());
        System.out.println(deepSheep2.getSheep().hashCode());

    }
}
