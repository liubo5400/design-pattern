package cn.lbo.learning.pattern.behavior.observer.demo2;

/**
 * @Author bjliubo
 * @Date 2024/2/4 11:11
 * @PackageName:cn.lbo.learning.pattern.behavior.observer.demo2
 * @ClassName: Photoset
 * @Description: TODO
 * @Version 1.0
 */
public class Photoset {

    private Long id;

    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
