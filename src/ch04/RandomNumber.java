package ch04;

public class RandomNumber {
    public static void main (String[] args) {
        //API, Math.random() double 타입 리턴, 0.0000000 ~ 0.9999999, 절대 1이 안 나온다.

        System.out.println( Math.random() );

        double value = 0.99999;
        double result = value * 10; //9.9999
        System.out.println("result: " + result);

        int intResult = (int)result; // 강제 형변환, 명시적 형변환
        System.out.println("intResult: " + intResult);

        double value2 = 0.00002;
        System.out.println("value2: " + (int)(value2 * 10.0)); // 0

        System.out.println((int)(Math.random() * 10.0)); //0 ~ 9 최댓값은 10-1인 9, 30이면 29
        // 아 이해함 왜 최댓값이 9가 나올까요 math.random 이 절대 1이 될 수 없기 때문이죠
    }
}


