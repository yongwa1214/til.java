package ch04.sec07;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int)(Math.random()*100) +1;
        System.out.println("answer: " + answer);
        /*
        1-100사이 숫자를 입력해주세요 > 50
        Down!
        1-100사이 숫자를 입력해주세요 > 25
        Up!

        맞출때까지 반복한다.

        정답!!

        */
        System.out.println("1~100사이 숫자를 입력해주세요 > ");
        while(true){
            int value = scanner.nextInt();
            if(value < answer){
                System.out.print("up >> ");
            } else if(value > answer){
                System.out.print("down >> ");
            } else{
                System.out.println("정답!");
                break;
            }
        }

    }
}
