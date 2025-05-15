package ch04.sec03;

// 매우 중요합니다.
public class StringEqualStudy {
    public static void main(String[] args){
        // 자바에서 가장 안 좋다고 평가되는 부분...
         String str1 = "Hello";
         String str2 = "Hello";

         System.out.printf("%s == %s : %b\n", str1, str2, str1 == str2);  // 문자열 비교는 ==을 사용하면 안됩니다.  >> 요건 주소값 비교
         System.out.printf("%s == %s : %b\n", str1, str2, str1.equals(str2)); // str1, str2 순서 상관없음
        // switch 는 문자열 비교 if문은 숫자? int? 그거 비교 하는게 좋다
    }
}
