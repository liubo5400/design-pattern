package cn.lbo.learning.pattern.structure.facade;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:32
 * @PackageName:cn.lbo.learning.pattern.structure.facade
 * @ClassName: Facade_test
 * @Description: 外观模式
 * 外观模式（Facade Pattern）是一种结构型设计模式，它提供了一个简单的接口来访问复杂系统中的子系统，从而隐藏了子系统的复杂性。
 * 外观模式属于对象型模式，它通过创建一个外观类，将客户端与子系统解耦，使得客户端只需要与外观类交互即可完成操作。
 * @Version 1.0
 */
public class Facade_test {

    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
    }
}
