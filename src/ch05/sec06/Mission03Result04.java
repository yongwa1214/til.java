package ch05.sec06;

import java.util.Arrays;

public class Mission03Result04 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(Arrays.toString(arr));
        System.out.println("------------");

        // if문 활용X
        // 단. 이 경우에는 값이 하나도 없으면 에러
        /*if(arr.length ==0){
            return;
            // 에러를 잡으려고 할 경우 위 코드를 사용합니다
        }*/
        System.out.print("[");
        for (int i = 1; i < arr.length; i++) {
            if (i != 0) {
                System.out.printf(", %d", arr[i]);
            }
            System.out.print("]");
        }
    }
}
