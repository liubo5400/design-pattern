package cn.lbo.learning.pattern.build.singleton;

/**
 * @Author bjliubo
 * @Date 2023/12/15 11:08
 * @PackageName:cn.lbo.learning.pattern.build.singleton
 * @ClassName: Singleton03
 * @Description: 静态内部类
 * 使用静态内部类来实现懒汉式单例模式，保证线程安全和性能。这种方式能达到双检锁方式一样的功效，但实现更简单。
 * @Version 1.0
 */
public class Singleton03 {

    private Singleton03() {
    }

    private static class SingletonHolder {
        private static final Singleton03 INSTANCE = new Singleton03();
    }

    public static Singleton03 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
