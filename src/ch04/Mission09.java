package ch04;

public class Mission09 {
    public static void main(String[] args) {
        int dan = 2 + (int)(Math.random() * 8.0); // 2~9 사이 랜덤값 생성
        System.out.printf("dan: %d단\n",dan );

        /*
        dan: 2
        2 x 1 = 2
        2 x 2 = 4
        ...
        2 x 9 = 18
        */

        for(int i = 1; i < 10 ; i++){
            System.out.printf("%d x %d = %d\n", dan, i, dan*i);
        // int dan을 여기다 넣으면 안됨 새로 생성 될때마다 dan은 랜덤값이 출력된다
        }
    }
}
