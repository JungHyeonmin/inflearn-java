package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002
        // 동일성 - 참조값이 다르면 안된다.
        System.out.println("new String() == 비교 : " + (str1 == str2));
        // 동등성 - 값만 맞으면 괜찮다. String.equals()는 오버라이딩 되어있다.
        System.out.println("new String() equals 비교 : " + (str1.equals(str2)));

        System.out.println();

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교" + (str3 == str4));
        System.out.println("리터럴 equals 비교" + (str3.equals(str4)));

    }
}
