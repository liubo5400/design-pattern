package cn.lbo.learning.pattern.behavior.visitor;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:36
 * @PackageName:cn.lbo.learning.pattern.behavior.visitor
 * @ClassName: Expression
 * @Description: TODO
 * @Version 1.0
 */
public interface Expression {

    void accept(Visitor visitor);
}
