package cn.lbo.learning.pattern.behavior.template;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:11
 * @PackageName:cn.lbo.learning.pattern.behavior.template
 * @ClassName: Template_test
 * @Description: 模板模式
 * Java模板模式是一种行为设计模式，它定义了一个操作中的程序骨架，将一些步骤延迟到子类中实现。
 * 这使得子类可以在不改变程序结构的情况下重新定义程序中的某些步骤。
 *
 * Java模板模式适用于以下场景：
 * 1.当需要定义一组算法，并且这些算法的结构相似，但是实现细节不同时，可以使用模板模式。
 * 2.当需要控制算法的流程，并且在算法的不同阶段需要不同的行为时，可以使用模板模式。
 * 3.当需要在不影响算法整体结构的情况下，对算法的某些步骤进行定制化时，可以使用模板模式。
 * 4.当需要在多个类中使用相同的算法时，可以使用模板模式，避免代码重复。
 *
 * @Version 1.0
 */
public class Template_test {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println("==================================");
        game = new Football();
        game.play();
    }
}
