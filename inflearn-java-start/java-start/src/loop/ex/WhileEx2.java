package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while (count < 10) {
            System.out.println("num = " + num);
            num += 2;
            count++;
        }
    }
}
