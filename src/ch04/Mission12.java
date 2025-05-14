package ch04;

public class Mission12 {
    public static void main(String[] args) {
        /*
        2 x 1= 2 \t*/

        for(int i= 1; i < 10; i++){
            for(int j = 2; j <10; j ++){
                System.out.printf("%d x %d = %d \t", j, i, i*j);
            }
            System.out.println();
        }
    }
}
