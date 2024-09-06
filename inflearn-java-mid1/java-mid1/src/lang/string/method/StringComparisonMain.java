package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "hello, Java!"; // 대문자 일부 있음
        String str2 = "hello, java!"; // 소문자만 있음
        String str3 = "HELLO, JAVA!"; // 대문자만 있음

        System.out.println("str1 equals str2 : " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase str2 : " + str1.equalsIgnoreCase(str2));

        // 두 문자를 사전순으로 비교한다.
        System.out.println("'c' compareTo 'a' : " + +"c".compareTo("a"));
        System.out.println("str1 compareTo str3 : " + str1.compareTo(str3));
        System.out.println("str1 compareTo str2 : " + str1.compareToIgnoreCase(str2));

        // 해당 단어로 시작/종료 하는지 비교한다.
        System.out.println("str1 start with 'Hello' : " + str1.startsWith("HelloHello"));
        System.out.println("str1 start with 'Java!' : " + str1.endsWith("Java!"));

    }
}
