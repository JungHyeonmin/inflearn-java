package poly.ex.pay1;

public abstract class PayStore {
    public static Pay findPay(String option) {
        // 결제수단 선택
        Pay pay;

        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("toss")) {
            return new TossPay();
        } else {
            return new DefaultPay();
        }
    }
}
