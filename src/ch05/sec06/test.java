package ch05.sec06;


import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i]= (int)(Math.random()* 121);
        }
        for(int i = 0; i < arr.length; i++){
            System.out.printf("arr[%d]: %d\n", i ,arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
// 배열을 출력하는 법 2번째