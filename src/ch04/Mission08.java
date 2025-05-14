package ch04;

public class Mission08 {
    public static void main(String[] args) {
//        int sum = 0;
//        sum = sum + 1;
//        sum = sum + 2;
//        sum = sum + 3;
//        System.out.println("sum: " + sum); // 3
 /*           for(int i = 1; i <= 100; i++){
                System.out.println(i + i); << 이거 왜 짝수 나오는지 모르겠음 멍청이 이슈...

            }*/
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum = sum + i; }
        System.out.println("sum: " + sum);
        /*for(0:인덱스 초기화 ;1: 조건식 ; 3: 인덱스 증감식){
                2: 실행문
        }*/

            // 1~100 모두 더한 값 출력하세요


    // 구구단
       /* int sum2 = 3;
        for(int i = 1; i < sum2; i++){
            for(int j = 1; j<= sum2; j++){
              //System.out.println(i + "*" + j + "=" + (i*j));
              System.out.printf("%d * %d = %d \n", i, j, i*j);
              // 내가 i*j를 하고 싶으면 ""안에다가 적는게 아니라 값을 %d로 두고
              // 넣을 값을 적을 때 i*j를 해줘야함 제발 기억해 내 공부를 해 생각을 하는거야
            }


        }*/

    }
}
 /*
 for(0:인덱스 초기화 ;1: 조건식 ; 3: 인덱스 증감식){
     2: 실행문
 }

 System.out.print << 이건 출력문이고 제발 생각을해 생각을
 */



