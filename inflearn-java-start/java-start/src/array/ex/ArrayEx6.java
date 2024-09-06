package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int temp;

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count = stdIn.nextInt();

        int[] numbers = new int[count];
        System.out.println(count + "개의 정수를 입력하세요.");
        for (int i = 0; i < count; i++) {
            numbers[i] = stdIn.nextInt();
        }
        int minN = numbers[0];
        int maxN = numbers[0];

        for (int i = 1; i < count; i++) {
            if (numbers[i] < minN) {
                minN = numbers[i];
            }
        }

        for (int i = 1; i < count; i++) {
            if (numbers[i] > maxN) {
                maxN = numbers[i];
            }
        }

        // 내 정렬
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("가장 작은 수 : " + numbers[0]);
        System.out.println("가장 큰 수 : " + numbers[count - 1]);

        System.out.println("가장 작은 수 : " + minN);
        System.out.println("가장 큰 수 : " + maxN);


    }
}
