package cn.lbo.learning.pattern.behavior.interpreter;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:32
 * @PackageName:cn.lbo.learning.pattern.behavior.interpreter
 * @ClassName: Expression
 * @Description: 解释器接口
 * @Version 1.0
 */
public interface Expression {

    int interpret(Context context);
}
