package ch05.sec06;

import java.util.Scanner;

public class Mission06Result {
    public static void main(String[] args) {
        //절대값 만들기
        Scanner scanner = new Scanner(System.in);

            System.out.print("숫자를 입력해 주세요> ");
            int num = scanner.nextInt();

            System.out.println(num < 0 ? -num : num);

    }
}

