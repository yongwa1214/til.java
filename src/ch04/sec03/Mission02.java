package ch04.sec03;

public class Mission02 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 101.0);
        System.out.println(score + "점");

        switch(score/10){
            case 10, 9: // 나눴을 때 몫이 10, 9
                System.out.println("A학점");
                break;
            case 8 : // 나눴을 때 몫이 8
                System.out.println("B학점");
                break;
            case 7 :
                System.out.println("C학점");
                break;
            default:
                System.out.println("D학점");
                break;
        }
    }
}
