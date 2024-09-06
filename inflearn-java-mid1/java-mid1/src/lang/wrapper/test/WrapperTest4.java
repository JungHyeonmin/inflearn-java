package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        // 코드 작성 - 오토 박싱, 오토 언박싱

        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        int intValue = integer1;
        System.out.println("intValue = " + intValue);

        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);
    }
}
