package ch04.sec03;

import java.util.Scanner;

public class IfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //적고 alt + Enter해줘야함
        while (true) {
            System.out.print("성별을 입력해 주세요. (w/m) > ");
            String gender = scanner.next();
            System.out.println("gender: " + gender);
            if ("w".equalsIgnoreCase(gender) || "여".equals(gender) || "여자".equals(gender)) {  // 이해함 아마 비교할 값이 앞 비교할 대상이 뒤인거임? 리터럴이 앞 변수가 뒤인게 좋은듯
                System.out.print("당신은 여자입니다.");
                break;
            } else if ("m".equalsIgnoreCase(gender) || "남".equals(gender) || "남자".equals(gender)) {
                System.out.print("당신은 남자입니다");
                break;
            } else {
                System.out.print("성별을 입력해주세요.");
                // 다시 돌아가려면 반복문을 실행해야함
            }

        }
    }
}
