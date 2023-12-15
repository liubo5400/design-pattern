package cn.lbo.learning.pattern.behavior.chain;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:08
 * @PackageName:cn.lbo.learning.pattern.behavior.chain
 * @ClassName: ConcreteHandlerThree
 * @Description: 创建具体的处理器类
 * @Version 1.0
 */
public class ConcreteHandlerThree extends AbstractHandler {

    @Override
    public void handle(String request) {
        if(request.equals("three")){
            System.out.println("具体处理者3负责处理该请求！");
        }else{
            if(getNextHandler() != null){
                getNextHandler().handle(request);
            }else{
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
