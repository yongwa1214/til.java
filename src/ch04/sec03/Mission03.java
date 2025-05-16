package ch04.sec03;

import java.util.Scanner;

public class Mission03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 > ");
        int score = scanner.nextInt(); // -10,0,120 단 숫자만 입력가능 int 이외 입력시 오류
        System.out.println("score:" + score);

        if (score > 100 || score < 0) {
            System.out.print("잘못된 점수 입니다.");
        } else if (score == 100) {
            System.out.println("A+");
        } else if (score >= 90) {
            switch (score % 10) {
                case 8, 9:
                    System.out.println("A+");
                    break;
                case 4, 5, 6, 7:
                    System.out.println("A0");
                    break;
                default:
                    System.out.println("A-");
                    break;
            }
        } else if (score >= 80) {
            switch (score % 10) {
                case 8, 9:
                    System.out.println("B+");
                    break;
                case 4, 5, 6, 7:
                    System.out.println("B0");
                    break;
                default:
                    System.out.println("B-");
                    break;
            }
        } else if (score >= 70) {
            switch (score % 10) {
                case 8, 9:
                    System.out.println("C+");
                    break;
                case 4, 5, 6, 7:
                    System.out.println("C0");
                    break;
                default:
                    System.out.println("C-");
                    break;
            }
        } else {
            System.out.println("D");
        }

       /* if (score > 100 || score < 0) {
            System.out.println("잘못된 점수 입니다.");
        } else if (score == 100) {
            System.out.println("학점: A+");
        } else {
            String grade = "";
            int first = score / 10;

            switch (first) {
                case 9:
                    if (score >= 98) grade = "A+";
                    else if (score >= 94) grade = "A0";
                    else grade = "A-";
                    break;
                case 8:
                    if (score >= 88) grade = "B+";
                    else if (score >= 84) grade = "B0";
                    else grade = "B-";
                    break;
                case 7:
                    if (score >= 78) grade = "C+";
                    else if (score >= 74) grade = "C0";
                    else grade = "C-";
                    break;
                default:
                    grade = "D";
            }
*/

        }
    }

