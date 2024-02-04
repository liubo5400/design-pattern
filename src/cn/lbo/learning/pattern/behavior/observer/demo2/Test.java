package cn.lbo.learning.pattern.behavior.observer.demo2;

/**
 * @Author bjliubo
 * @Date 2024/2/4 14:28
 * @PackageName:cn.lbo.learning.pattern.behavior.observer.demo2
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        PhotosetOperate photosetOperate = new PhotosetOperate();
        photosetOperate.registerObserver(new PhotosetEsObserver());
        photosetOperate.registerObserver(new PhotosetRefreshObserver());

        photosetOperate.notifyObservers(1L);
    }
}
