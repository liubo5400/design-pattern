package cn.lbo.learning.pattern.behavior.state;

/**
 * @Author bjliubo
 * @Date 2023/12/15 16:07
 * @PackageName:cn.lbo.learning.pattern.behavior.state
 * @ClassName: State_test
 * @Description: 状态模式
 * Java状态模式是一种行为型设计模式，它允许对象在内部状态改变时改变它的行为。
 * 状态模式将状态封装成独立的类，并将请求委托给当前状态对象，从而实现状态的切换和状态行为的变化。
 *
 * 使用状态模式的场景包括：
 * 当一个对象的行为取决于它的状态，并且它必须在运行时根据状态改变它的行为时。
 * 当一个对象需要根据状态改变它的数据和方法时。
 * 当一个对象需要在多个状态之间切换，并且每个状态都有不同的行为时。
 *
 * 注意事项：
 * 状态模式可以增加类的数量，因此需要在设计时考虑类的数量和复杂性。
 * 状态模式需要对状态进行封装，因此需要在设计时考虑状态的可扩展性和可维护性。
 *
 * @Version 1.0
 */
public class State_test {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteState1());
        context.request();
        context.setState(new ConcreteState2());
        context.request();
    }
}
