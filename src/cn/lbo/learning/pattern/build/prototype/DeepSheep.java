package cn.lbo.learning.pattern.build.prototype;

import java.io.*;

/**
 * @Author bjliubo
 * @Date 2023/12/15 11:15
 * @PackageName:cn.lbo.learning.pattern.build.prototype
 * @ClassName: PrototypeDemo
 * @Description: 深拷贝
 * @Version 1.0
 */
public class DeepSheep implements Cloneable, Serializable {

    public DeepSheep() {
    }

    public DeepSheep(String id, String type,Sheep sheep) {
        this.id = id;
        this.type = type;
        this.sheep = sheep;
    }

    private String id;
    protected String type;

    private Sheep sheep;

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

    public Sheep getSheep() {
        return sheep;
    }

    public void setSheep(Sheep sheep) {
        this.sheep = sheep;
    }

    //深拷贝实现方式1：重写clone方法来实现深拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        DeepSheep deepSheep = null;
        //先对DeepProtoType的基本数据类型和String类型的属性进行拷贝
        try {
            deep = super.clone();
            //然后对引用类型DeepCloneableTarget的属性进行拷贝
            deepSheep = (DeepSheep) deep;
            deepSheep.sheep = (Sheep) sheep.clone();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return deepSheep;
    }

    //深拷贝实现方式2：通过对象序列化实现深拷贝。（推荐使用）,
    //这种方式把对象当做一个整体进行克隆，不像方式一一样，引用对象要单独拿出来克隆
    public DeepSheep deepClone() {

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//把对象序列化

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepSheep deepSheep = (DeepSheep) ois.readObject();//把对象反序列化
            return deepSheep;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            try {
                if (ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
