package ch04.sec07;

import java.util.Scanner;

public class Mission07_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int money = 0;

        while (run) {
            System.out.println("--------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔액조회 | 4.종료 | 5.대출");
            System.out.println("--------------------------------------");
            System.out.print(" 선택: ");

            int strNum = scanner.nextInt();

            if (strNum == 1) {
                System.out.print("예금액을 넣어주세요 ");
                int value = scanner.nextInt();
                money = money + value;
                System.out.printf("예금액: %,d원 \n잔액: %,d원 \n", value, money);
            } else if (strNum == 2) {
                System.out.print("출금액을 입력해주세요 ");
                int value = scanner.nextInt();
                if(money >= value){
                    money = money - value;
                    System.out.printf("출금액: %,d원 \n잔액: %,d원\n", value, money);
                } else {
                    System.out.println("⚠ 잔액이 부족합니다");
                    System.out.println("현재 잔고: " + money);
                }
            } else if (strNum == 3) {
                System.out.printf("잔액: %,d\n",money);
            } else if (strNum == 4) {
                System.out.println("안녕히 가십시오.");
                run = false;
            } else if(strNum == 5) {
                while(true) {
                    System.out.println("고객님의 직업을 고르시오");
                    System.out.println("-----------------------------------------------------");
                    System.out.println("1. 학생 | 2. 직장인 | 3. 자택경비원 | 4. 기타 | 5. 뒤로가기");
                    System.out.println("-----------------------------------------------------");
                    System.out.print("선택: ");
                    int jobBt = scanner.nextInt();
                    if (jobBt == 1) {
                        System.out.println("대출이 어렵습니다.");
                        System.out.println();
                    } else if (jobBt == 2) {
                        System.out.print("필요한 대출 금액을 입력해주세요: ");
                        int okane = scanner.nextInt();
                        if (okane > 100000000) {
                            System.out.println("1억 이상의 대출은 아래 전화번호로 문의해주십쇼");
                            System.out.println("053-000-000");
                            break;
                        } else {
                            money = money + okane;
                            System.out.println("고객님의 통장으로 대출금이 지급되었습니다");
                            System.out.println("잔고를 눌러 확인하여 주십시오.");
                            System.out.println();
                        }
                    } else if (jobBt == 3) {
                        System.out.println("직업이 없을 시 대출이 불가능합니다.");
                        break;
                    } else if (jobBt == 4) {
                        System.out.println("상담사와의 상담이 필요합니다. 아래 전화번호로 문의해주세요");
                        System.out.println("053)000-0000");
                        break;
                    } else if (jobBt == 5) {
                        break;
                    } else {
                        System.out.print("잘못 입력하셨습니다");
                    }
                }
            }
            else {
                System.out.println("올바른 번호를 입력하시오.");
            }
        }
    }
}
