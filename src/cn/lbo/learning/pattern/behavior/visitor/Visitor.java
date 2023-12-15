package cn.lbo.learning.pattern.behavior.visitor;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:35
 * @PackageName:cn.lbo.learning.pattern.behavior.visitor
 * @ClassName: Visitor
 * @Description: TODO
 * @Version 1.0
 */
public interface Visitor {

    void visit(NumberExpression elementA);

    void visit(AdditionExpression elementB);
}
