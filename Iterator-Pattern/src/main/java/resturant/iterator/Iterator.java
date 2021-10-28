package resturant.iterator;

public interface Iterator<T> {
    public boolean hasNext();

    /**
     * 调用next() 前，必须使用hasNext() 检查是否还有元素。
     * @return
     */
    public T next();
}
