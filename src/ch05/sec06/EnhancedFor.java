package ch05.sec06;

public class EnhancedFor {
        /*
        향상된 for문

        배열같은 시퀀스가 있는 컬렉션에서 사용가능하다. (순서가 있는 컬렉션 배열이나 리스트 등)

        for(하나의 값 다음을 수 있는 변수 : 컬렉션) {

         }

        */

    public static void main(String[] args) {
        // 예시
        int[] intArr = {11, 12, 19, 33};
        for(int num: intArr){  // 읽기 전용
            System.out.println(num);
        }
        System.out.println("--------------------");
        for( int i = 0; i <intArr.length; i++){
            int num = intArr[i];
            System.out.println(num);
        }
    }
}
