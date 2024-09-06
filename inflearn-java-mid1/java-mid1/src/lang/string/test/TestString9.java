package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        // 코드 작성 - split() 사용

        String[] strs = email.split("@");
        System.out.println("ID : " + strs[0]);
        System.out.println("Domain : " + strs[1]);
    }
}
