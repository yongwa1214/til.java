package ch04.sec05;

import java.util.Scanner;

public class Mission01Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         /*
        합계를 구할 숫자를 입력하세요. (종료: 0)
        >> 100
        >> 200
        >> 300
        >> 400
        */
        System.out.println("합계를 구할 숫자를 입력하세요. (종료: 0)");
        boolean run = true;
        int sum = 0;

        while(run){
            System.out.print(">> ");
            int value= scanner.nextInt();


            if (value==0){
                run = false;
            } else{
                sum += value; // sum = sum + value;
            }


        }
            System.out.println("합계 : " + sum);

    }
}
