package lang.string.test;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        
        // 코드 작성 - substring() 사용
        
        String filename = str.substring(0,5);
        String extName = str.substring(5,9);

        System.out.println("filename = " + filename);
        System.out.println("extName = " + extName);
    }
}
