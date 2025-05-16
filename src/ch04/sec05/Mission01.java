package ch04.sec05;

import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         /*
        합계를 구할 숫자를 입력하세요. (종료: 0)
        >> 100
        >> 200
        >> 300
        >> 400
        */

        boolean run = true;
        int sum = 0;

        System.out.println("합계를 구할 숫자를 입력하세요. (종료: 0)");
        System.out.print(">> ");

        while(run){
            int value= scanner.nextInt();
            sum = sum + value; // 값을 저장해야 하니까 이렇게 해줘야한다고 값을 저장안하면 날아간다... 기억하자

            if (value==0){ // 그리고 빠져나오기
                break;  // while은 조건이 참일 때 계속 돎 거짓이면 빠져나옴 break는
                        // break는 그냥 빠져나오는거고 run=false는 내가 변수 값을 false로 바꿔서
                        // 빠져나오는거다. 제발 기억 좀 하자
            }
            else{
                System.out.printf(">> %d + ", sum);
            }


        }
            System.out.println("합계 : " + sum);
    }
}
