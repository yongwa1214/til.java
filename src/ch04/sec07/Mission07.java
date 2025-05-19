package ch04.sec07;

import java.util.Scanner;

public class Mission07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int money = 0;

        while (run) {
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 | 5.대출");
            System.out.println("------------------------------");
            System.out.print(" 선택: ");

            int strNum = scanner.nextInt();

            if (strNum == 1) {
                System.out.print("예금액을 넣어주세요 ");
                int value = scanner.nextInt();
                money = money + value;
                System.out.printf("예금액: %,d \n잔액: %,d \n", value, money);
            } else if (strNum == 2) {
                System.out.print("출금액을 입력해주세요 ");
                int value = scanner.nextInt();
                if(money >= value){
                    money = money - value;
                    System.out.printf("출금액: %,d \n잔액: %,d\n", value, money);
                } else {
                    System.out.println("⚠ 잔액이 부족합니다");
                    System.out.println("현재 잔고: " + money);
                }
            } else if (strNum == 3) {
                System.out.printf("잔액: %,d\n",money);
            } else if (strNum == 4) {
                System.out.println("안녕히 가십시오.");
                run = false;
            } else if(strNum ==5) {
                System.out.println("귀하의 직업을 고르시오");
                System.out.println("------------------------------");
                System.out.println("1. 학생 | 2. 직장인 | 3. 자택경비원");
                System.out.println("------------------------------");
            }
            else {
                System.out.println("올바른 번호를 입력하시오.");
            }
        }
    }
}
