package loop.ex;

public class ForEx3 {
    public static void main(String[] args) {
        int max = 0;
        for (int i = 1; i <= 100; i++) {
            max += i;
            System.out.println("max = " + max);
        }
    }
}
