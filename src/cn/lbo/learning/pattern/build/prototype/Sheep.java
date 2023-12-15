package cn.lbo.learning.pattern.build.prototype;

import java.io.Serializable;

/**
 * @Author bjliubo
 * @Date 2023/12/15 11:15
 * @PackageName:cn.lbo.learning.pattern.build.prototype
 * @ClassName: PrototypeDemo
 * @Description: 浅拷贝
 * @Version 1.0
 */
public class Sheep implements Cloneable, Serializable {

    public Sheep() {
    }

    public Sheep(String id, String type) {
        this.id = id;
        this.type = type;
    }

    private String id;
    protected String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
