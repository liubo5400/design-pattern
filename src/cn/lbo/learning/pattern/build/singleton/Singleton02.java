package cn.lbo.learning.pattern.build.singleton;

/**
 * @Author bjliubo
 * @Date 2023/12/15 11:06
 * @PackageName:cn.lbo.learning.pattern.build.singleton
 * @ClassName: Singleton02
 * @Description: 懒汉式，双检锁
 * 在懒汉式基础上加入双重检验锁，保证线程安全和性能。
 * @Version 1.0
 */
public class Singleton02 {

    private volatile static Singleton02 instance = null;

    private Singleton02() {
    }

    public static Singleton02 getInstance() {
        if (instance == null) {
            synchronized (Singleton02.class) {
                if (instance == null) {
                    instance = new Singleton02();
                }
            }
        }
        return instance;
    }

}
