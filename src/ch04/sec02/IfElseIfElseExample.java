package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 55;

        if(score >= 90 ) { // 소괄호 안에 들어올 수 있는 타입은 불린 타입 밖에 없다
            System.out.println("점수가 " + score + "입니다");
            System.out.println("등급은 A입니다");
        } else if (score >= 80) {
            System.out.println("점수가 80~89입니다.");
            System.out.println("등급은 B입니다. ");
        } else if (score >= 70){
            System.out.println("점수가 70~79점입니다");
            System.out.println("등급은 c입니다. ");
        }else {
            System.out.println(score+"점으로 기준치 미달입니다");
            System.out.println("D 등급");
        }
        System.out.println("--끝--");
    }
}
