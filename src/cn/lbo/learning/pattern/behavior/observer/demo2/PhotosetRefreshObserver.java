package cn.lbo.learning.pattern.behavior.observer.demo2;

/**
 * @Author bjliubo
 * @Date 2024/2/4 14:28
 * @PackageName:cn.lbo.learning.pattern.behavior.observer.demo2
 * @ClassName: PhotosetRefreshObserver
 * @Description: TODO
 * @Version 1.0
 */
public class PhotosetRefreshObserver implements PhotosetStatusObserver{
    @Override
    public void update(Long id) {
        System.out.println("刷新页面：" + id);
    }
}
