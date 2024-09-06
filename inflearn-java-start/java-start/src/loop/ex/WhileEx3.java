package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int max = 0;
        int count = 1;
        while (count <= 100) {
            max += count;
            System.out.println("max = " + max);
            count++;
        }
    }
}
