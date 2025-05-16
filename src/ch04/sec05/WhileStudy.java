package ch04.sec05;

public class WhileStudy {
    /*
       반복문 2개
       for loop: 몇 번 반복해야 하는지 정확히 알 때 사용
       while loop: 언제 반복을 멈춰야하는지 알 때 사용 그럼 보통 true/ false 이면 하겠네

       // 조건식이 true인 동안 실행문을 반복합니다. // 제발 기억 하자고
       while (조건식) {
           실행문
       }
       */
    public static void main(String[] args){
        // for 문으로 0~9까지 출력하시오
        for(int i = 0; i<10; i++){
            System.out.println(i);
        }
        int i = 0;
        while(i<10) {
            System.out.println(i++); // 이것도 가능 i++을 따로 써도 되고 ()안에 같이 써도 됨

        }
    }
}
