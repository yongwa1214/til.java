//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//메소드(Method), 메인 메소드 String의 S는 꼭 대문자를 써주도록 하자

        System.out.printf("Hello and welcome!"); //콘솔에 내용을 출력하시오.

        for (int i = 1; i <= 5; i++) { //반복문, for문, for-loop / i가 5가 될때까지 계속 돌림
            System.out.println("i = " + i);

        }
    }
}

// 클래스 이름은 무조건 대문자로 시작.
// class 이름은 Pascal Case 로 작성을 해야한다.
// 메인 메소드는 위와 똑같이 적을 것
/*
    클래스라는 그릇을 만들어야 한다.
    그릇에는 코드가 작성된다. (메소드, 변수 등등)
    클래스 이름은 파일 이름과 같아야한다.
    메소드는 함수라고 보면 된다.
    메인 메소드는 굉장히 중요한 메소드이다. 프로그램의 시작점.
    메소드를 만드는 것은 "메소드 정의" 라고 표현.
    메소드를 사용하는 것은 "메소드 호출"라고 표현
    메소드가 호출되면 메소드 내용이 한줄씩 한줄씩 실행이 된다.
    ()있으면 메소드임, 근데 예약어 옆()은 메소드 아님 ex if(어쩌구)<< 얜 아님
 */
