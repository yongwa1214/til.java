package ch04;

public class Mission03 {
    public static void main(String[] args) {
        //int 2value = ???; // 1 ~100 사이의 랜덤값 나오게 해주시고

        //value = 5; 라면
        // 출력 : 5는(은) 홀수입니다.
        // 랜덤값이 value = 97; 라면
        // 출력 : 97는(은) 홀수입니다.

        int value = 1 + (int)(Math.random()* 101);

//        if (value % 2 == 0 ){
//            System.out.printf("%d 는(은) 짝수 입니다.\n", value);
//        } else {
//            System.out.printf("%d 는(은) 홀수 입니다.\n", value);
//        }
 /*
         if (value % 2 == 0 ){
            System.out.println(value + "는(은) 짝수 입니다.");
        } else {
            System.out.println(value + "는(은) 홀수 입니다.");
        }
        */

       String oddEven = "홀";
        if(value % 2 ==0){
            oddEven = "짝";
        }
        System.out.printf("%d 는(은) %s수 입니다.\n", value, oddEven);
        // 3항식으로
        // System.out.printf("%d 는(은) %s수 입니다.\n"
        //                  , value, value % 2 ==0 ? "짝":"홀");



    }
}
