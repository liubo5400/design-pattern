package cn.lbo.learning.pattern.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:33
 * @PackageName:cn.lbo.learning.pattern.behavior.interpreter
 * @ClassName: Context
 * @Description: 上下文
 * @Version 1.0
 */
public class Context {

    private Map<String, Integer> variables = new HashMap<>();

    public void setVariable(String name, int value) {
        variables.put(name, value);
    }

    public int getVariable(String name) {
        return variables.get(name);
    }

}
