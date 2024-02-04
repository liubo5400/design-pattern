package cn.lbo.learning.pattern.behavior.observer.demo2;

/**
 * @Author bjliubo
 * @Date 2024/2/4 14:27
 * @PackageName:cn.lbo.learning.pattern.behavior.observer.demo2
 * @ClassName: PhotosetEsObserver
 * @Description: TODO
 * @Version 1.0
 */
public class PhotosetEsObserver implements PhotosetStatusObserver {
    @Override
    public void update(Long id) {
        System.out.println("更新es信息：" + id);
    }
}
