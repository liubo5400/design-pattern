package cn.lbo.learning.pattern.behavior.visitor;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:36
 * @PackageName:cn.lbo.learning.pattern.behavior.visitor
 * @ClassName: NumberExpression
 * @Description: TODO
 * @Version 1.0
 */
public class NumberExpression implements Expression{

        private int number;

        public NumberExpression(int number) {
            this.number = number;
        }

        @Override
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }

        public int getNumber() {
            return number;
        }
}
