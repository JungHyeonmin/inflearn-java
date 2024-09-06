package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("하나의 정수를 입력하세요");
        int num1 = stdIn.nextInt();

        if (num1 % 2 == 0) {
            System.out.println(num1 + "는 짝수입니다.");
        } else {
            System.out.println(num1 + "는 홀수입니다.");
        }
    }
}
