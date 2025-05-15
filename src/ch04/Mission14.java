package ch04;

public class Mission14 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 4;
        System.out.println("star: " + star);

        for (int i = 1; i <= star; i++) {
            for (int k = star-1 ; k > i - 1; k--) { //..?
                System.out.print("_");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=star; i++) {
            int underCnt = star - i;
            for(int k1=0; k1<underCnt; k1++) {
                System.out.print("_");
            }
            for(int k2=0; k2<i; k2++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 이것도 가능
        System.out.println("===========================");
        for(int i=star; i>0; i--) {

            int k=1; // 최대한 for 안에 연산이 안 들어가는게 좋음 그래서 따로 뺐다.
            for( ; k<i; k++) {
                System.out.print("_");
            }
            for( ; k<=star; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 두개로 해결하기
        System.out.println("===========================");
        for (int i = star; i > 0; i--) {

            for (int k = 1; k <= star; k++) {
                System.out.print(k < i ? "_" : "*"); // 3항 연산
                                // 결과 = 조건식 ? 참결과 : 거짓결과
            }
            System.out.println();

        }
          /* 피라미드
         for(int i = 1; i<=star; i++){
             for(int k = star-1; k > i-1; k--){
                 System.out.print(" ");
             }
             for(int j = 0; j < (i*2)-1; j++){
                 System.out.print("*");
             }
             System.out.println();

         } */
    }
}
