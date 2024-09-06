package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        // 오토 박싱
        Integer boxedValue = 5;

        // Wrapper -> Primitive
        // 오토 언박싱
        int unboxedValue = boxedValue;

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
