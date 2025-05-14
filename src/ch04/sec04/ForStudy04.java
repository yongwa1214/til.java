package ch04.sec04;

public class ForStudy04 {
    public static void main(String[] args) {
        //A작업 "야!"
        //B작업 "야!" 5번 반복
        //C작업 B작업 5번 반복
        for(int k =0; k <5; k++) { // C
            for (int i = 0; i < 5; i++) { // B
                System.out.println("야!"); // A
            }
        }
    }
}
