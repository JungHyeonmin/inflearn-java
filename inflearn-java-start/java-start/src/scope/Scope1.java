package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if (true) {
            int x = 20; // x 생존 시작
            // 블록 내부에서 블록 외부는 접근 가능
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x생존 종료
        // 오류, 변수 x에 접근 불가
        // System.out.println("main x = " + x);
        System.out.println("main m = " + m);
    } // m 생존 종료
}
