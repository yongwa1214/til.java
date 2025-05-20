package ch05.sec06;

import java.sql.SQLOutput;

public class Mission04 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int a = 0; // 값을 저장을 해야겠죠 이거 벌써 5번째잖아 기억해
        // arr 배열이 가지고 있는 숫자 모두 더한 값 출력
        for(int i = 0; i< arr.length; i++){
            a += arr[i]; // 여기서 처리된 값이 위에 int a에 대입됨

            // 여기다가 int a = 어쩌구 하면 할 때마다 리셋된다고요
            // for문에서 실행된 값을 얻고 싶으면 변수 선언을 하고 저장을 해야합니다.

        }
        System.out.println("sum: " + a);


    }
}

// 기억해 변수 선언을 해야 값을 저장할 수 있다.
