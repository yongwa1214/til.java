package ch04.sec08;

public class Game369 {
    public static void main(String[] args) {
        for(int i =1; i<=100; i++){
            System.out.printf("i=%d ", i);

            int temp = i;
            do{
                if( temp % 10 % 3 == 0 && temp % 10 != 0){
                System.out.print("짝");
                }
            } while((temp /= 10) != 0) ;
            // temp = temp / 10
            // 와 기존의 temp 값에서 temp/10의 값이 다시 입력됨
            // 예) 996/10 > 99
            // temp = 99/10
            // temp = 9/10 >>몫 0 나머지 9
            // temp = 0/10 >> 그만.
            System.out.println();
        }
    }
}
