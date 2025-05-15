package ch04.sec03;

public class SwitchStudy {
    /*
        switch 에서는 관계연산자(<,>,<=,>=,!=) 사용할 수 없다.
        오로지 == equal만 가능
        switch 는 case 에 맞는 값이 있으면 진입을 하고,
        break; 키워드를 만날 때까지 모두 실행한다.

        switch( 변수 ) {  // 범위 안됨, 숫자 비교 별로임 문자열 비교: 좋음
            case 값1:
                처리1;
                break;
            case 값2:
                처리2;
                break;
            [...]
            default: // 위치 상관 없다 밑에 있든 위에 있든 다 상관없다
                나머지 처리;
                break;  // 마지막에는 break 있어도 되고 없어도 됨
        }
        */
    public static void main(String[] args){
        int num = 2;

        switch(num){
            case 1:
                System.out.println("1입니다.");
            case 2:
            case 3:
                System.out.println("2 or 3입니다.");
                break;
            default:
                System.out.println("값이 없네요.");
            case 4:
                System.out.println("4입니다.");
                break;
        }
        System.out.println("-- End -- ");
    }
}
