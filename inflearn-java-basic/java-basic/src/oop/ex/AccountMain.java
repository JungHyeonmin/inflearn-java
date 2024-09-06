package oop.ex;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        Account ac = new Account();
        int choice = 0;
        while (choice != 4) {
            System.out.println("1. 입금 2. 출금 3. 확인 4. 종료");
            choice = stdIn.nextInt();
            switch (choice) {
                case 1: // 입금
                    System.out.print("입금할 금액을 입력하세요. : ");
                    ac.deposit(stdIn.nextInt());
                    break;
                case 2: // 출금
                    System.out.print("출금할 금액을 입력하세요. : ");
                    ac.withdraw(stdIn.nextInt());
                    break;
                case 3: // 잔액 확인
                    System.out.println("잔액 확인");
                    ac.check();
                    break;
                case 4: // 종료
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default: // 오류
                    System.out.println("다시 입력해주세요.");
            }
        }
    }
}
