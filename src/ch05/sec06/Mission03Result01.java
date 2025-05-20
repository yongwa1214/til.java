package ch05.sec06;

import java.util.Arrays;

public class Mission03Result01 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(Arrays.toString(arr));
        System.out.println("------------");

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {

            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);

            }
        }
        System.out.print("]");
    }
}
