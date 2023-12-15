package cn.lbo.learning.pattern.behavior.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:20
 * @PackageName:cn.lbo.learning.pattern.behavior.command
 * @ClassName: CommandExecutor
 * @Description: TODO
 * @Version 1.0
 */
public class CommandExecutor {

    private Map<String, Command> commandMap = new HashMap<>();

    public CommandExecutor() {
        commandMap.put("create", new CreateFileCommand());
        commandMap.put("delete", new DeleteFileCommand());
    }

    public void executeCommand(String commandName, String[] args) {
        Command command = commandMap.get(commandName);
        if (command == null) {
            System.out.println("命令不存在！");
            return;
        }
        command.execute(args);
    }
}
