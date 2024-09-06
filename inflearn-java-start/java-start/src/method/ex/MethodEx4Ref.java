package method.ex;

import java.util.Scanner;

public class MethodEx4Ref {
    public static void main(String[] args) {
        int balance = 0; // 잔액
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            int amount;

            /*if (choice == 1) { // 입금
                System.out.print("입금액을 입력하세요 : ");
                int amount = scanner.nextInt();
                deposit(balance, amount);

            } else if (choice == 2) {// 출금
                System.out.print("출금액을 입력하세요 : ");
                int amount = scanner.nextInt();
                withdraw(balance, amount);
            } else if (choice == 3) { // 잔액 확인
                System.out.println("현재 잔액 : " + balance + "원");
            } else if (choice == 4) { // 종료
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("올바르게 입력해주세요.");
            }*/

            switch (choice) {
                case 1: // 입금
                    System.out.print("입금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2: // 입금
                    System.out.print("출금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3: // 잔액 확인
                    System.out.println("현재 잔액 : " + balance + "원");
                    break;
                default:
                    System.out.println("올바르게 입력해주세요.");
                    break;
            }
        }
    }

    public static int deposit(int balance, int amount) { // 입금
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다." + " 현재 잔액 : " + balance);
        return balance;
    }

    public static int withdraw(int balance, int amount) { // 출금
        if (amount > balance) {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다." + " 현재 잔액 : " + balance);
        }
        return balance;
    }
}