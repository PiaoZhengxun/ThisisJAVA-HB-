package chapter15_CellectionFramework.map.hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        map.put("spring", "12");
        map.put("summer", "123");
        map.put("fall", "1234");
        map.put("winter", "12345");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("insert ID and password");
            System.out.print("id: ");
            String id = scanner.nextLine();

            System.out.print("password");
            String password = scanner.nextLine();
            System.out.println();

            if (map.containsKey(id)) {
                if (map.get(id).equals(password)) {
                    System.out.println("logged in");
                    break;

                } else {
                    System.out.println("non match");
                }
            } else {
                System.out.println("your id does not exist");
            }
        }

    }
}
