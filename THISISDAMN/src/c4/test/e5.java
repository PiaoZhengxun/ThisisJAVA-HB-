package c4.test;

public class e5 {
    public static void main(String[] args){
        for(int i=0; i<100;i++){
            for(int j=0; j<100;j++){
                if (i != 0 && j != 0){
                    if ((4*i)+(5*j)==60){
                        System.out.println("("+i+", "+j+")");
                    }
                }

            }
        }
    }
}
