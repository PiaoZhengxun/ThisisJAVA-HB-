package c5.test;

import c11.object.S;

import java.util.Scanner;

public class e9 {
    public static void main(String[] args){
        boolean run = true;
        int studentNum=0;
        int[] scores = null;
        Scanner scn = new Scanner(System.in);

        while(run){
            System.out.println("---");
            System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("---");
            System.out.print("선택 : ");

            int selectNo = scn.nextInt();

            switch(selectNo){
                case 1: System.out.print("학생수 : ");
                        studentNum = scn.nextInt();
                        scores = new int[studentNum];
                        System.out.println(scores.length);
                        break;
                case 2:
                    for (int i = 0; i < scores.length; i++){
                        System.out.print("score["+i+"] :");
                        int input = scn.nextInt();
                        scores[i] = input;
                    }
                    for(int i = 0; i < scores.length; i++) {
                        System.out.println(scores[i]);
                    };
                    break;
                case 3:
                    for (int i = 0; i < scores.length; i++){
                        System.out.println("Score["+i+"] : " + scores[i]);
                    }
                    break;
                case 4:
                    int highScore = 0;
                    double avg = 0.0;
                    int sum = 0;
                    for (int score: scores){
                        sum += score;
                        if(highScore < score){
                            highScore = score;
                        }
                    }
                    avg = (double)sum / studentNum;
                    System.out.println("high score : "+ highScore);
                    System.out.println("avg : " + avg);
                    break;
                case 5: run=false; break;
                default: break;
            }
        }
    }
}
