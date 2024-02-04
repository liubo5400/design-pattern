package cn.lbo.learning.pattern.behavior.observer.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author bjliubo
 * @Date 2024/2/4 11:13
 * @PackageName:cn.lbo.learning.pattern.behavior.observer.demo2
 * @ClassName: PhotosetStatusObervable
 * @Description: 图集状态抽象类
 * @Version 1.0
 */
public abstract class PhotosetStatusObservable {

    List<PhotosetStatusObserver> observers = new ArrayList<>();

    public void registerObserver(PhotosetStatusObserver observer){
        observers.add(observer);
    }

    public void removeObserver(PhotosetStatusObserver observer) {
        observers.remove(observer);
    }

    public abstract void notifyObservers(Long id);
}
