package lang.wrapper.test;

import java.util.Iterator;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        // 코드 작성 - Int 래퍼 클래스


        // 문자열 숫자를 기본형으로 반환
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int sum = num1 + num2;
        System.out.println("두 수의 합 : " + sum);
    }
}