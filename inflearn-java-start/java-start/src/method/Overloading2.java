package method;

public class Overloading2 {
    public static void main(String[] args) {
        myMethod(1.2, 2);
        myMethod(1, 2.0);

    }

    public static void myMethod(int a, double b) {
        System.out.println("1번 호출");
    }

    public static void myMethod(double a, int b) {
        System.out.println("2번 호출");
    }
}
