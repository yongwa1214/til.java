package ch05.sec06;

import java.util.Arrays;

public class Mission01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // new 로 만든 배열의 디폴트 값은 항상 0이다  바꿀 수 없

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i+1) * 100;

        }
        System.out.println(Arrays.toString(arr));
    }
}
