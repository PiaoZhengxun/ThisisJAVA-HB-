package chapter13_Generic.genericMethod.compareMethod;

public class CompareMethodExample {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(1, "apple");
        boolean result1 = Util.<Integer, String>compare(p1, p2);

        if(result1) {
            System.out.println("logically equal");
        } else {
            System.out.println("logically non-equal");
        }

        Pair<String, String> p3 = new Pair<>("user1", "hong");
        Pair<String, String> p4 = new Pair<>("user2", "hong");
        boolean result2 = Util.compare(p3, p4);

        if(result2) {
            System.out.println("logically equal");
        } else {
            System.out.println("logically non-equal");
        }
    }
}
