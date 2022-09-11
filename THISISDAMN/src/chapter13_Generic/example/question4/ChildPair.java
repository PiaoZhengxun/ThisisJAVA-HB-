package chapter13_Generic.example.question4;

public class ChildPair<K, V> extends Pair<K, V> {
    private K key;
    private V value;

    public ChildPair(K key, V value) {
        super(key, value);
    }
}
