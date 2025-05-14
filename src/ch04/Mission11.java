package ch04;

public class Mission11 {
    public static void main(String[] args) {
        for(int i = 2; i < 10; i++){
            for(int j = 0; j <= i; j++){
                System.out.printf("%d x %d = %d\n", i,j,i*j);
            }
            System.out.println();
        }
    }
}
