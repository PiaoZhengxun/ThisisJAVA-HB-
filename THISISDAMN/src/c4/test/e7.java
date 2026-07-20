package c4.test;

import java.util.Scanner;

public class e7 {
    public static void main(String[] args){
        boolean run = true;
        int balance = 0;
        Scanner scn = new Scanner(System.in);

        while(run){
            System.out.println("---------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------");
            System.out.print("선택: ");

            int input = scn.nextInt();

            switch (input){
                case 1:
                    System.out.print("예금액 : ");
                    balance += scn.nextInt();
                    System.out.println();
                    break;
                case 2:
                    System.out.print("출금액 : ");
                    balance -= scn.nextInt();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("잔고 : " + balance);
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    System.out.println("선택옵션 내에서 선택해주세요");

            }
        }
    }
}
