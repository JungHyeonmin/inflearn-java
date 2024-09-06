package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수들
        int b = 127; // -128 ~ 127
        short s = 23767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 21억)

        // –9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long l = 9223372036854775807L;

        // 실수 (double이 더 큰 범위를 가질 수 있다.)
        float f = 10.0f; // 소수점 계산에서 오류가 종종 발생하기 때문에 double을 사용해라
        double d = 10.0;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
}
