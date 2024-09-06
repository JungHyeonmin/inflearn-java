package poly.ex.pay1;

public class PayMain1 {
    public static void main(String[] args) {

        PayService payService = new PayService();

        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        System.out.println();

        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        System.out.println();

        //toss 결제
        String payOption3 = "toss";
        int amount3 = 10000;
        payService.processPay(payOption3, amount3);

        System.out.println();

        //잘못된 결제 수단 선택
        String payOption4 = "bad";
        int amount4 = 15000;
        payService.processPay(payOption4, amount4);
    }
}