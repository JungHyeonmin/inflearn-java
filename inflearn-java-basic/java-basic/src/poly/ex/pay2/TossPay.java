package poly.ex.pay2;

public class TossPay implements Pay{
    public boolean pay(int amount) {
        System.out.println("토스페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
