package ch02.sec01;

public class VariableExchangeExample {
    public static void main (String[] args){
        int x = 3, y =5;
        System.out.println("x: " + x + ", y:" + y); //x: 3, y: 5



       int temp = x ; // 빈 공간에다 x의 값을 저장을 해놓음
       x = y;         // 변수를 잠깐 옮겨놔요
       y = temp;

        System.out.println("x: " + x + ", y: " +y); // x:5, y:3

    }
}
