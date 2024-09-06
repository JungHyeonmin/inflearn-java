package poly.ex.pay2;

public class PayMain3 {

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

        //잘못된 결제 수단 선택
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);
        System.out.println();

        //Toss 결제
        String payOption4 = "toss";
        int amount4 = 105000;
        payService.processPay(payOption4, amount4);
        System.out.println();

    }

}
