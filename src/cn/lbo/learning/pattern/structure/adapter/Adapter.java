package cn.lbo.learning.pattern.structure.adapter;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:08
 * @PackageName:cn.lbo.learning.pattern.structure.adapter
 * @ClassName: Adapter
 * @Description: TODO
 * @Version 1.0
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    /**
     * 适配器将Adaptee的接口转换成Target的接口
     */
    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
