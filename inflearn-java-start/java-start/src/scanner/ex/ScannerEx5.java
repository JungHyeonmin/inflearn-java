package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int num1 = stdIn.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int num2 = stdIn.nextInt();
        System.out.print("두 숫자 사이의 모든 정수 : ");
        if (num1 > num2) {
            int temp;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) {
                System.out.print(", ");
            }
        }
    }
}
