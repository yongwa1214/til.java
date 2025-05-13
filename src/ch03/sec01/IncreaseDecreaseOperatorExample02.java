package ch03.sec01;

public class IncreaseDecreaseOperatorExample02 {
    public static void main(String[] args) {
        int i1 = 5;
        // 읽기 > 쓰기
        System.out.printf("i1: %d\n",  i1++); // i1 읽기부터 함 5
        // 아 ㅇㅋ 이해함 그니까 일단 보여주고 뒤에서 더하기 작업을 했다는거네요?
        System.out.printf("i1: %d\n",  i1++); // 6
        // 더하기 작업을 했으니까 i1에는 6이 담겨져 있었다. 그래서 일단 또 담겨있는걸 먼저 보여줌
        System.out.printf("i1: %d\n",  i1);// 위에 덧셈이 됨 i1=6 7
        // 진짜 이해했음

        int i2 = 5;
        // 쓰기 > 읽기
        System.out.printf("i2: %d\n", ++i2); //6
        System.out.printf("i2: %d\n", ++i2);// 7
        System.out.printf("i2: %d\n", i2); // 7
    }

}
