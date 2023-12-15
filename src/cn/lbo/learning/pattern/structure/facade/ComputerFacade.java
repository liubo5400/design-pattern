package cn.lbo.learning.pattern.structure.facade;

/**
 * @Author bjliubo
 * @Date 2023/12/15 14:35
 * @PackageName:cn.lbo.learning.pattern.structure.facade
 * @ClassName: ComputerFacade
 * @Description: TODO
 * @Version 1.0
 */
public class ComputerFacade {

    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start(){
        cpu.processData();
        memory.load();
        hardDrive.readData();
    }
}
