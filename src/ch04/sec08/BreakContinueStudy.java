package ch04.sec08;

public class BreakContinueStudy {
    public static void main(String[] args){
        for(int i= 0; i < 10; i++){
            if(i==5) {
                break; // 바로 탈출
            }
            System.out.println(i);
        }
        System.out.println("-----------------");

        for(int j= 0; j < 10; j++){
            if(j==5) {
                continue; // 바로 증감식으로 가서 반복문을 끝냄(skip이랑 비슷하다)
                          // c
            }
            System.out.println(j);
        }
    }
}
