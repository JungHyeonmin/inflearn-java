package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(3); // 짝 t, 홀 f
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
