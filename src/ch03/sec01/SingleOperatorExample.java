package ch03.sec01;

public class SingleOperatorExample {
    public static void main(String[] args) {
        int x = -100; // 마이너스 연산자
        System.out.printf("x:%d \n", x);

        x= -x; // x = 100 * -1; >> x = 100;
        System.out.printf("x:%d \n", x);

        int y = 100 * -1;
        System.out.printf("y:%d \n", y);

        y= -y;
        System.out.printf("x:%d \n", y);
    }
}
