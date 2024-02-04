package cn.lbo.learning.pattern.behavior.observer.demo2;

/**
 * @Author bjliubo
 * @Date 2024/2/4 14:11
 * @PackageName:cn.lbo.learning.pattern.behavior.observer.demo2
 * @ClassName: PhotosetOperate
 * @Description: TODO
 * @Version 1.0
 */
public class PhotosetOperate extends PhotosetStatusObservable{


    @Override
    public void notifyObservers(Long id) {
        observers.forEach(observer -> observer.update(id));
    }

}
