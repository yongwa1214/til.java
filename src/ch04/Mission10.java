package ch04;

public class Mission10 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 4.0) + 3;
        System.out.printf("star: %d\n", star);


        for (int i = 1; i <= star; i++) {
            for (int j = 0; j < star; j++) {
                System.out.print("*");

            }
            System.out.println(); //println은 그냥 호출해도 개행해줌
            // 생각을 해 생각을!! 문제를 쪼개서 생각해 1. *** 이 필요함 2. *** << 이걸 3번 반복해야함
            // 그리고 개행을 하면 된다고오 개행은 언제 함? 2를 쪼개면 됨


        }
        // for 하나로 해결하기 뭐하나 좋은게 없음 성능도 떨어져 어려워 복잡해 어쩌구 걍 for 두개로 해결하세요
        int total = star * star;
        for (int i = 1; i <= total; i++) {
            System.out.print("*");
            if(i % star == 0){
                System.out.println();
            }
        }
    }
}