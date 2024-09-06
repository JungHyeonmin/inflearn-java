package static2;

public class DecoData {
    private int instanceValue;
    private static int staticVlaue;

    public static void staticCall() {
        // static은 static만 접근 가능
        staticVlaue++;  // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근

        // instanceValue++;    // 인스턴스 변수 접근, compile error
        // instanceMethod();   // 인스턴스 메서드 접근, compile error
    }


    public void instanceCall() {
        // 인스턴스는 static, 인스턴스 모두 접근 가능
        staticVlaue++;  // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근

        instanceValue++;    // 인스턴스 변수 접근
        instanceMethod();   // 인스턴스 메서드 접근

    }

    public static void staticCall(DecoData data) {
        // 매개변수로 인스턴스를 받으면 사용 가능하다.
        data.instanceCall();
        data.instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticVlaue);
    }
}
