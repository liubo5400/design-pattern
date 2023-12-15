package cn.lbo.learning.pattern.behavior.iterator;

/**
 * @Author bjliubo
 * @Date 2023/12/15 15:42
 * @PackageName:cn.lbo.learning.pattern.behavior.iterator
 * @ClassName: ArrayInterator
 * @Description: TODO
 * @Version 1.0
 */
public class ArrayInterator<T> implements Interator<T> {

    private T[] array;

    private int index;

    public ArrayInterator(T[] array) {
        this.array = array;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }
        return array[index++];
    }
}
