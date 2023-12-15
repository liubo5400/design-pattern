package cn.lbo.learning.pattern.behavior.command;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:16
 * @PackageName:cn.lbo.learning.pattern.behavior.command
 * @ClassName: Command_test
 * @Description: 命令模式
 * 命令模式是一种行为设计模式，它允许将请求封装为一个对象，从而使不同的请求可以使用不同的参数进行参数化，队列或日志请求，以及支持可撤销的操作。
 *
 * @Version 1.0
 */
public class Command_test {

    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutor();

        commandExecutor.executeCommand("create", new String[]{"test.txt"});
        commandExecutor.executeCommand("delete", new String[]{"test2.txt"});
    }
}
