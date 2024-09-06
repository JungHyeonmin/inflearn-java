package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str = "hello";
        // String은 불변 객체이기 때문에 새로운 String에 값을 추가하자
        String str2  = str.concat(str);
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
    }
}
