package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
            String str = stdIn.nextLine();


            if (str.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요 : ");
            int age = stdIn.nextInt();
            stdIn.nextLine();

            System.out.println("입력한 이름 : " + str + ", 입력한 나이 : " + age);
        }
    }
}
