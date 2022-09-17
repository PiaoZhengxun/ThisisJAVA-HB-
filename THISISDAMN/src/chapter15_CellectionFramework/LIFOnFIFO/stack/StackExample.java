package chapter15_CellectionFramework.LIFOnFIFO.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        while (!coinBox.isEmpty()){
            Coin coin = coinBox.pop();
            System.out.println("brought coin : "+coin.getValue()+" Won");
        }
    }
}
