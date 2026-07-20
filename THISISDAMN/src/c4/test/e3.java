package c4.test;

public class e3 {
    public static void main (String[] args){
        int sum = 0;
        for(int i =0; i <= 100; i++){
            if(i % 3 == 0){
                sum += i;
            }
        }
        System.out.print("3배수의 합 :" + sum);
    }
}
