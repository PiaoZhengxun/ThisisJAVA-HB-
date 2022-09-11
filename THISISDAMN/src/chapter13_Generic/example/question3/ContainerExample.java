package chapter13_Generic.example.question3;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<>();
        container1.set("Name 1", "Job 1");
        String name1 = container1.getKey();
        String job = container1.getValue();
        System.out.println(name1 + " // " + job);

        Container<String, Integer> container2 = new Container<>();
        container2.set("Name 2", 35);
        String name2 = container2.getKey();
        int age = container2.getValue();
        System.out.println(name2 + " // " + age);

    }
}
