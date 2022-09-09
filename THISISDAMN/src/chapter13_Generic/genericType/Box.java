package chapter13_Generic.genericType;

public class Box<T> {
    private T t;
    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
