package chapter13_Generic.example.question3;

public class Container<J, H> {

    private J Key;
    private H value;

    public void set(J j, H h){
        this.Key = j;
        this.value = h;
    }

    public J getKey() {
        return Key;
    }

    public H getValue() {
        return value;
    }

}
