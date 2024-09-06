package loop;

public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;
        for (int i = 1; i <= endNum; i++) { // 1, 3, 6
            sum += i;
            System.out.println("i  = " + i + " sum = " + sum);
        }
    }
}
