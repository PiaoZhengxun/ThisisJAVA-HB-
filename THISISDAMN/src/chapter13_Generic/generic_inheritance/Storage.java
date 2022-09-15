package chapter13_Generic.generic_inheritance;

public interface Storage<T> {
    public void add(T item, int index);
    public T get(int index);
}
