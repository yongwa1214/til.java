package ch05.sec06;

public class Mission08 {
    public static void main(String[] args) {
        int[] arr = {77, 34, 109, 21, 101, 48};

        int min= arr[0];
        for(int i =1; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
