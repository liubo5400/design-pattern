package cn.lbo.learning.pattern.build.singleton;

/**
 * @Author bjliubo
 * @Date 2023/12/15 11:06
 * @PackageName:cn.lbo.learning.pattern.build.singleton
 * @ClassName: Singleton_test
 * @Description: 单例测试
 * @Version 1.0
 */
public class Singleton_test {

    public static void main(String[] args) {
        Singleton01 instance1 = Singleton01.getInstance();
        Singleton01 instance2 = Singleton01.getInstance();
        System.out.println(instance1 == instance2);

        Singleton02 instance3 = Singleton02.getInstance();
        Singleton02 instance4 = Singleton02.getInstance();
        System.out.println(instance3 == instance4);

        Singleton03 instance5 = Singleton03.getInstance();
        Singleton03 instance6 = Singleton03.getInstance();
        System.out.println(instance5 == instance6);

        Singleton04 instance7 = Singleton04.SingletonEnum.INSTANCE.getInstance();
        Singleton04 instance8 = Singleton04.SingletonEnum.INSTANCE.getInstance();
        System.out.println(instance7 == instance8);
    }
}
