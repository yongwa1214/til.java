package ch02;

public class PrintVsPrintln {
    public static void main(String[] args) {
        //print는 개행이 없음
        System.out.print("안녕");
        System.out.print("안녕");
        System.out.print("안녕");

        System.out.println();
        System.out.println("--------------");

        //println
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        //print + 계행(이스케이프 문자\n)
        System.out.print("안녕\n");
        System.out.print("안녕\n");
        System.out.print("안녕\n");
        //쌍따옴표 안에 쌍따옴표를 표시하고 싶으면 역슬러시 사용 "\"안녕\"" >> "안녕"으로 출력

        //printf
         int age =22;
         String name = "홍길동";
         float height = 172.5f;
         double height2 = 172.5;
         // age,name,height 변수를 활용하여 아래처럼 출력시켜주세요.
         // 제 이름은 홍길동이고 나이는 22살이며 키는 172.5cm 입니다.
        System.out.println("제 이름은 " + name + "이고 나이는 " + age + "살이며 키는 " + height + "cm입니다.");
        System.out.printf("제 이름은 %s이고 나이는 %d살이며 키는 %.1fcm입니다. \n", name, age, height);
        // %는 위치, 순서대로 넣어야함
        // s, d, 1f는 데이터 타입 입니다. f는 실수 .1은 기능인데 소숫점을 한 자리까지만 표기한다

    }
}
