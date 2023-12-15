package cn.lbo.learning.pattern.build.singleton;

/**
 * @Author bjliubo
 * @Date 2023/12/15 11:05
 * @PackageName:cn.lbo.learning.pattern.build.singleton
 * @ClassName: Singleton01
 * @Description: 饿汉式
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 * @Version 1.0
 */
public class Singleton01 {

    private static Singleton01 instance = new Singleton01();

    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        return instance;
    }
}
