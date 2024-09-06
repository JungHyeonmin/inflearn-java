package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        // 기존 문자열 뒤에 문자열을 합치는 메서드
        // 반환값은 String
        str.concat("java");
        System.out.println("str = " + str);
    }
}
