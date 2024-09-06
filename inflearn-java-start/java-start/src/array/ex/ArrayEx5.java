package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int count = stdIn.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double average = 0;

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i < count; i++) {
            numbers[i] = stdIn.nextInt();
        }
        for (int i : numbers) {
            sum += i;
        }
        average = (double) sum / count;
        System.out.println("입력한 정수의 합계 : " + sum);
        System.out.println("입력한 정수의 평균 : " + average);
    }
}
