package poly.ex.pay2;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result = false;
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        // 결제 가능 확인
        Pay pay = PayStore.findPay(option);
        // 결제 기능 동작
        result = pay.pay(amount);

        // 결제 결과 확인
        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
