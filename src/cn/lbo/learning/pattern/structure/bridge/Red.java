package cn.lbo.learning.pattern.structure.bridge;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:59
 * @PackageName:cn.lbo.learning.pattern.structure.bridge
 * @ClassName: Red
 * @Description: TODO
 * @Version 1.0
 */
public class Red implements Color {

    @Override
    public void applyColor() {
        System.out.println("apply red color");
    }
}
