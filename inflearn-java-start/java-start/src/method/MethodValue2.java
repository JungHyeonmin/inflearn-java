package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, num1 : " + number);
        changeNymber(number);
        System.out.println("4. changeNumber 호출 후, num1 : " + number); // 결과 : 5
    }

    public static void changeNymber(int number) {
        System.out.println("2. changeNumber 변경 전, num2 : " + number);
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, num2 : " + number);
    }
}
