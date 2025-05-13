package ch04;

import java.util.Scanner; // 이거 안 뜨면 스캔 안됩니다

public class Mission04 {
    public static void main(String[] Args) {
        // int score = (int)(Math.random()* 201) ; // 0~ 200 사이의 랜던값
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해주세요");
        int score = scan.nextInt();
        System.out.printf("score: %d\n", score);

        // 만약 score 값이 100 ~ 90점 사이면 A학점
        // 만약 score 값이 80 ~ 89점 사이면 B학점
        // 만약 score 값이 70 ~ 79점 사이면 C학점
        // 만약 score 값이 70 미만이면 D
        // 만약 score 값이 100점을 넘기거나 0점 아래면 "측정 불가" 출력

        if (score > 100 || 0 > score) { // 0미만 혹은 100초과인 경우
            System.out.println("측정 불가");
        } else if (score >= 90) {
            System.out.println("A학점");
        } else if (score >= 80) {
            System.out.println("B학점");
        } else if (score >= 70) {
            System.out.println("C학점");
        } else {
            System.out.println("D학점");

            // 마지막걸 먼저 적은 후에 90 80 70 이렇게 범위를 좁혀 오면
            // 70 미만은 else로 처리할 수 있음
        }

    }
}


