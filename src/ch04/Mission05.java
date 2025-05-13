package ch04;

public class Mission05 {
    public static void main(String[] args) {
        int starCount = (2 + (int) (Math.random() * 6)); // 1) 2~7 사이 랜덤값
        System.out.printf("starCount: %d\n", starCount);


//        for(int i = 0; i < starCount; i++) {
//            System.out.print("*");
//        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}

