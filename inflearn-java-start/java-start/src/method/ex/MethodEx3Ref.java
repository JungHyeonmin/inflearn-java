package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;

        balance = deposit(balance, 1000);
        balance = withdraw(balance, 2000);

        System.out.println("최종 금액 : " + balance + "원");
    }

    //입금
    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액 : " + balance + "원");
        return balance;
    }

    // 출금
    public static int withdraw(int balance, int draw) {
        if (balance >= draw) {
            balance -= draw; // 잔고
            System.out.println(draw + "원을 출금하였습니다. 현재 잔액 : " + balance + "원");
        } else {
            System.out.println(draw + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
