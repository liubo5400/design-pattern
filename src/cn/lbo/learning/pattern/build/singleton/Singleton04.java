package cn.lbo.learning.pattern.build.singleton;

/**
 * @Author bjliubo
 * @Date 2023/12/15 11:10
 * @PackageName:cn.lbo.learning.pattern.build.singleton
 * @ClassName: Singleton04
 * @Description: 枚举
 * 使用枚举来实现单例模式，保证线程安全和防止反射攻击。
 * @Version 1.0
 */
public class Singleton04 {

    /**
     * 将已经有的class转换成枚举单例
     */
    public enum SingletonEnum {
        INSTANCE;
        private Singleton04 instance;
        SingletonEnum() {
            instance = new Singleton04();
        }

        public Singleton04 getInstance() {
            return instance;
        }
    }
}
