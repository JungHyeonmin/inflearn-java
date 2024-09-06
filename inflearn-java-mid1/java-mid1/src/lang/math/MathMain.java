package lang.math;

public class MathMain {
    public static void main(String[] args) {
        // 기본 연산 메서드
        System.out.println("max(10, 20)" + Math.max(10, 20));   // 최대값
        System.out.println("min(10, 20)" + Math.min(10, 20));   // 최소값
        System.out.println("abs(-10)" + Math.abs(-10));         // 절대값

        // 반올림 및 정밀도 메서드
        System.out.println("ceil(2.1)" + Math.ceil(2.1));       // 올림
        System.out.println("ceil(2.6)" + Math.floor(2.6));      // 내림
        System.out.println("ceil(2.5)" + Math.round(2.5));      // 반올림

        // 기타 유용한 메서드
        System.out.println("sqrt(4) : " + Math.sqrt(4));        // 제곱근
        System.out.println("random() : " + Math.random());      // 0.0 ~ 1.0 사이의 double값
    }
}
