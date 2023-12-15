package cn.lbo.learning.pattern.structure.adapter;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:06
 * @PackageName:cn.lbo.learning.pattern.structure.adapter
 * @ClassName: Adapter_test
 * @Description: 适配器模式
 * 适配器模式将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * @Version 1.0
 */
public class Adapter_test {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);
        target.request();
    }
}
