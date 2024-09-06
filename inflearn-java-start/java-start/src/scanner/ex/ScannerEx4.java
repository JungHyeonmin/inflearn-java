package scanner.ex;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력하세요 : ");
        int n = stdIn.nextInt();

        System.out.println(n + "단의 구구단 : ");
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", i,n,i*n);
        }
    }
}
