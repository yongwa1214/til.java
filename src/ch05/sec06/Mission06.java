package ch05.sec06;

import java.util.Scanner;

public class Mission06 {
    public static void main(String[] args) {
        //절대값 만들기
        Scanner scanner = new Scanner(System.in);
        boolean a = true;
        //절대값 출력
        while (a) {
            System.out.print("숫자를 입력해 주세요> ");
            int num = scanner.nextInt();
            if (num < 0) {
                System.out.println(-1 * num);

            } else if (num == 0) {
                a = false;
            } else {
                System.out.println(num);

            }
        }
    }
}

