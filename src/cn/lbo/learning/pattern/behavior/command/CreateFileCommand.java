package cn.lbo.learning.pattern.behavior.command;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:19
 * @PackageName:cn.lbo.learning.pattern.behavior.command
 * @ClassName: CreateFileCommand
 * @Description: TODO
 * @Version 1.0
 */
public class CreateFileCommand implements Command {
    @Override
    public void execute(String[] args) {
        System.out.println("创建文件：" + String.join(",", args) + "成功！");
    }
}
