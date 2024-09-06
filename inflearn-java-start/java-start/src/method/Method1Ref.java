package method;

public class Method1Ref {
    public static void main(String[] args) {
        // 계산 1

        int sum1 = add(1, 2);
        System.out.println("결과1 출력 : " + sum1);

        System.out.println("==============");

        // 계산 2
        int sum2 = add(5, 15);
        System.out.println("결과1 출력 : " + sum2);
    }

    // add 메서드
    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " 연산 수행");
        int sum = a + b;
        return sum;
    }
}
