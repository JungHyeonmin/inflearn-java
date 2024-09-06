public class StaticExample {
    // 정적 변수
    static int staticVariable = 10;

    // 인스턴스 변수
    int instanceVariable = 20;

    // 정적 메서드
    public static void staticMethod() {
        // static 메서드 내부에서는 static 변수에 접근 가능
        System.out.println("Static variable : " + staticVariable);
        // 아래 주석을 해제하면 에러 발생
        // System.out.println("Instance variable: " + instanceVariable);
        // 정적 메서드에서는 인스턴스 변수에 접근할 수 없음
    }

    // 인스턴스 메서드
    public void instanceMethod() {
        // 인스턴스 메서드 내부에서는 static 변수와 인스턴스 변수에 모두 접근 가능
        System.out.println("Static variable: " + staticVariable);
        System.out.println("Instance variable: " + instanceVariable);
    }

    public static void main(String[] args) {
        // 정적 메서드 호출
        staticMethod();

        // 인스턴스 생성
        StaticExample example = new StaticExample();
        // 인스턴스 메서드 호출
        example.instanceMethod();
    }
}
