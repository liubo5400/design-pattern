package cn.lbo.learning.pattern.behavior.observer;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:46
 * @PackageName:cn.lbo.learning.pattern.behavior.observer
 * @ClassName: Display
 * @Description: TODO
 * @Version 1.0
 */
public class Display implements Observer {

    private String name;

    private String msg;

    public Display(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.msg = message;
        System.out.println(name + "收到消息：" + message);
        display();
    }

    @Override
    public String name() {
        return name;
    }

    public void display() {
        System.out.println(name + "展示消息:" + msg);
    }
}
