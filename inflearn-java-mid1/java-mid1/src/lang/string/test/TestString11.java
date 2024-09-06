package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";

        // 코드 작성 - reverse() 사용 (new StringBuilder())

        StringBuilder s = new StringBuilder(str);
        System.out.println(s.reverse());
    }
}
