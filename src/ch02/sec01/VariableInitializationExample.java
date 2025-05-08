package ch02.sec01;

public class VariableInitializationExample {
    public static void main (String[] args) {
        int value; //변수 선언, 선언ㅇ르 할 때 데이터 타입 지정! (int는 정수 타입)
        value = 10; // 쓰기

        int value2 = 20; // 쓰기
        /*
        에러 종류 크게 2가지
        - 컴파일 에러: 실행ㅇ르 할 수 없음. 컴파일 자체가 불가능. 문법적 문제가 있거나 명확한 문제가 보이면...
          컴파일: 0과1로 바꾸는 작업
        - 런타임 에러
        */
        // 변수 사용 방법 2가지 : 읽기(read), 쓰기(write) 구분법: 우측에 = 있으면 쓰기 없으면 읽기
        // ; 빼먹으면 오류남 {} 끝에는 안 들어감
        int result = value + 10; // value 아래에 빨간색 언더라인, 컴파일 에러
        System.out.println(result);
    }
}
// 변수 선언 후 최초로 값을 넣는 것을 초기화(initialization)라고 함