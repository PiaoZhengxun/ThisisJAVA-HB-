package chapter14_LambdaExpressions.existReturn;

public class MyFuntioanlInterfaceExample {

    public static void main(String[] args) {

        MyFunctionalInterface fi;

        fi = (x ,y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> {
            return x + y;
        };
        System.out.println(fi.method(2, 5));

        fi = (x, y) -> sum(x, y);
        System.out.println(fi.method(2,5));
    }
    public static int sum(int x, int y){
        return (x + y);
    }
}
