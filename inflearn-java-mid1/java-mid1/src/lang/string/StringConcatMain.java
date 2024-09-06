package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        String result1 = str1.concat(str2);
        System.out.println(result1);

        String result2 = str1 + str2;
        System.out.println(result2);
    }
}
