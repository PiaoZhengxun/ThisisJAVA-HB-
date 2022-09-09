package chapter13_Generic.genericType;

public class BoxExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<String>();
        box1.set("hello");
        String str = box1.get();
        System.out.println(str);

        Box<Integer> box2 = new Box<Integer>();
        box2.set(3);
        int value = box2.get();
        System.out.println(value);
    }
}
