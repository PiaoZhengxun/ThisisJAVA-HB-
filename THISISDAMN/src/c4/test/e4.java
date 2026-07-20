package c4.test;

public class e4 {
    public static void main(String[] args){
        int a;
        int b;
        boolean stop = true;
        while (stop){
            a = (int)(Math.random()*5)+1;
            b = (int) (Math.random()*5) +1;
            System.out.println("(" + a+", "+b+")");
            if (a+b == 5){
                stop = false;
            }
        }
    }
}
