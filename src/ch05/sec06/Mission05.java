package ch05.sec06;

public class Mission05 {
    public static void main(String[] args) {
        int[] arr = new int[10];
//
        //for 쓰기용,(10, 11, 12, 13,...)
        for(int i = 0; i < arr.length; i++){
            arr[i]= i + 10;
        }


        //for 출력용(읽기 후 출력
        for(int k = 0; k <arr.length; k++){
            System.out.printf("arr[%d] : %d \n", k, arr[k]);
        }
        //arr[0] : 10
        // 작업 분리가 좋음 나중에 메소드를 만드는데 그때는 분리해주는게 좋다고함
        // 읽기 쓰기 같이 쓰지 말고 쓰기, 읽기 이렇게 분리해줍시다
    }
}
