package ch02.sec01;

public class VariableUseExample {
    public static void main (String[] args){
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간 " + minute + "분");
        // (1)hour + "시간 "
        // (2) 3 + "시간 " 문자열 + ?? ==> 문자열이 이김 싹다 문자열로 자동 형변환해줌
        // (3) "3" + "시간 "
        // (4) "3시간 "
        // (5) "3시간 " + minute
        // (6) "3시간 " + 5
        // (7) "3시간 " + "5"
        // (8) "3시간 5"
        // (9) "3시간 5" + "분"
        // (10) "3시간 5분" >> 연산의 결과
        // (11) 연산의 결과를 println이 콘솔에 출력한다.

        int totalMinute = minute + hour * 60; // 185
        System.out.println("총 "+ totalMinute + "분" );

    }
}

