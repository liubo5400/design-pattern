package cn.lbo.learning.pattern.behavior.command;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:20
 * @PackageName:cn.lbo.learning.pattern.behavior.command
 * @ClassName: DeleteFileCommand
 * @Description: TODO
 * @Version 1.0
 */
public class DeleteFileCommand implements Command {
    @Override
    public void execute(String[] args) {
        System.out.println("删除文件：" + String.join(",", args) + "成功！");
    }
}
