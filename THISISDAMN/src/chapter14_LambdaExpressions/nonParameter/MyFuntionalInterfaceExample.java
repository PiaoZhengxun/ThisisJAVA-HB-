package chapter14_LambdaExpressions.nonParameter;

public class MyFuntionalInterfaceExample {
    public static void main(String[] args) {
        MyFuntionalInterface fi;

        fi = () -> {
            String str = "method call";
            System.out.println(str);
        };

        fi.method();

        fi = () -> {
            System.out.println("method call2");
        };
        fi.method();

        fi = () -> {
            System.out.println("method call3");
        };
        fi.method();
    }
}
