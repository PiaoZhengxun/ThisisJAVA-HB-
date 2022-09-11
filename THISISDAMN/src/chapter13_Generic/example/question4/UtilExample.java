package chapter13_Generic.example.question4;

public class UtilExample {

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Name", 35);
        Integer age = Util.getValue(pair, "Name");
        System.out.println(age);

        ChildPair<String, Integer>  childPair = new ChildPair<>("name2", 20);
        Integer childAge = Util.getValue(childPair, "name22");
        System.out.println(childAge);

//        OtherPair<String, Integer> otherPair = new OtherPair<>("name3", 20);
//        int otherAge = Util.getValue(otherPair, "name3");
//        System.out.println(otherAge);


    }
}
