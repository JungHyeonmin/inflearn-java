package oop.ex;

public class Account {
    int balance = 0; // 잔액

    void deposit(int amount) { // 입금 메서드
        System.out.println("계좌에 " + amount + "를 입금해라.");
        balance += amount;
        System.out.println("잔고 : " + balance);
    }
    
    void withdraw(int amount) { // 출금
        System.out.println("계좌에서 " + amount + "출금 시도해라");
        if (balance < amount) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
            System.out.println("잔고 : " + balance);
        }
    }

    void check() { // 확인
        System.out.println("잔고 : " + balance);
    }
}
