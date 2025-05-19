package ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) {
        /*for(int i= 1; i<=10; i++){ // 이 라인은 수정 불가
            System.out.print(i++ + 1 + " ");
        }*/
        for(int i= 1; i<=10; i++){ // 이 라인은 수정 불가

            if(i % 2 == 1) { // i % 2 != 0 과 같다
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
