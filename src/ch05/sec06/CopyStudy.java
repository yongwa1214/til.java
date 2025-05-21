package ch05.sec06;

import java.util.Arrays;

public class CopyStudy {
    public static void main(String[] args) {
        //int[] arr1 = new int[10];
        int[] arr2 = {10, 20, 30};
        //int[] arr3 = new int[]{10, 20, 30}

        int[] temp = arr2;  // 주소 복사 (Shallow Copy
                            // => 같은 주소를 복사 해놨기 때문에 고치면 주소를 공유하는 애들 전부가 고쳐짐
                            // 8 byte 밖에 안됨 뭘 복사하든 아무튼 복사하면 8 byte
        temp[1] = 200;
        System.out.println(Arrays.toString(temp));
    }
}
