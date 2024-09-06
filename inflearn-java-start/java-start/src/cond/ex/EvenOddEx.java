package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 5;
        String result = x % 2 == 0 ? "짝수입니다." : "홀수입니다.";
        System.out.println(result);
    }
}
