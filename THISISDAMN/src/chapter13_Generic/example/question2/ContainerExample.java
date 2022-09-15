package chapter13_Generic.example.question2;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container<>();
        container1.setT("Piao");
        String str = container1.getT();
        System.out.println(str);

        Container<Integer> container2 = new Container<>();
        container2.setT(6);
        int value = container2.getT();
        System.out.println(value);
    }
}
