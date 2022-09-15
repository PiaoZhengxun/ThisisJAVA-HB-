package chapter14_LambdaExpressions.classMember;

public class UsingThis {
    public int outterField = 20;

    class Inner {
        int innerField = 20;

        void method() {
            MyFunctionalInterface fi = () -> {
                System.out.println("outter field / " + outterField);
                System.out.println("outter field / "+ UsingThis.this.outterField + "\n");

                System.out.println("inner field / " + innerField);
                System.out.println("inner field / " + this.innerField);
            };

            fi.method();
        }
    }
}
