package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        printMessage(3);
        System.out.println();

        printMessage(5);
        System.out.println();

        printMessage(7);

    }
    public static void printMessage (int n) {
        String message = "Hello, world";
        for(int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
