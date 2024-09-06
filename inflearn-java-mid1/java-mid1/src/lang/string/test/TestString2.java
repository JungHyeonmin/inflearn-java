package lang.string.test;

public class TestString2 {
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        
        // 코드 작성 - .length() 사용
        
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s = %d\n", arr[i], arr[i].length());
            s += arr[i];
        }
        System.out.println("sum = " + s.length());
    }
}
