package ch04.sec02;

public class IfElseExample {
    public static void main(String[] args) {
        int score = 93;

        if(score >= 90 ) { // 소괄호 안에 들어올 수 있는 타입은 불린 타입 밖에 없다
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다");
        } else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다. ");
        }
    }
}
