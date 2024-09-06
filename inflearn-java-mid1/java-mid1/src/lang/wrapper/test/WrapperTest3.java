package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        // 코드 작성 - 박싱, 언박싱
        Integer integer1 = Integer.valueOf(Integer.parseInt(str));
        // == Integer integer1 = Integer.valueOf(str);

        System.out.println("integer1 = " + integer1);

        int intValue = integer1.intValue();
        System.out.println("intValue = " + intValue);

        Integer integer2 = Integer.valueOf(intValue);

        System.out.println("integer2 = " + integer2);
    }
}
