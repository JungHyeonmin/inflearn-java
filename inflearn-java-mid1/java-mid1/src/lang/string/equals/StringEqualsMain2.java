package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002

        System.out.println("메서드 호출 비교 1 : " + isSame(str1, str2));

        System.out.println();

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교 2 : " + isSame(str3, str4));
    }

    private static boolean isSame(String x, String y) {
        // 개발자 입장에서 같은 문자열을 다룰 때
        // 문자열 풀에서 온건지, 객체를 만든 거에서 온건지 모르기 때문에
        // 무. 조. 건. equals()[동등성] 비교를 해야한다.
        // return x == y; // 동일성
        return x.equals(y);
    }
}
