package poly.ex.pay0;

// 클라이언트
public class PayService {

    private PayCheck paycheck = new PayCheck();

    public void processPay(String option, int amount) {
        paycheck.processPay(option, amount);
    }
}