package ch05.sec06;

import java.util.Arrays;

public class Mission03Result03 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(Arrays.toString(arr));
        System.out.println("------------");

        // , 찍고 숫자찍으면 다음과 같다 -1 처리를 하지 않아도 됨
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i !=0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
            }
        //System.out.print( ( i!=0 ? ", " : "") +arr[i];) // 3항식을 활용하면 이렇게 된다

        System.out.print("]");
    }
}
