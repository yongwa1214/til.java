package ch05.sec06;

public class Mission07 {
    public static void main(String[] args) {
        int[] arr = {77, 34, 109, 21, 101, 48};

        // arr 배열에서 가장 큰 값 찾아서 출력
        // 두개씩 비교를 해 변수 지정해서 arr[0] 을 담아두고 비교하자
        // 큰것만 살아남아
        //
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
