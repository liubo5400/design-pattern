package cn.lbo.learning.pattern.behavior.iterator;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:41
 * @PackageName:cn.lbo.learning.pattern.behavior.iterator
 * @ClassName: Interator
 * @Description: TODO
 * @Version 1.0
 */
public interface Interator<T> {

    boolean hasNext();

    T next();
}
