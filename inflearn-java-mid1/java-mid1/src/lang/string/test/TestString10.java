package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        // 코드 작성 - split(), join() 사용

        String[] fruitsArr = fruits.split(",");
        for (String string : fruitsArr) {
            System.out.println(string);
        }

        System.out.println(fruits.join("-",fruitsArr[0], fruitsArr[1], fruitsArr[2]));


    }
}
