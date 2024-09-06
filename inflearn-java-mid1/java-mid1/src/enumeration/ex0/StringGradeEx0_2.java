package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // 존재하지 않는 등급을 입력 - 할
        int vip = discountService.discount("VIP", price);
        System.out.println("존재하지 않는 VIP 할인 금액 : " + vip);
        
        // 오타
        int diammond = discountService.discount("DIAMMOND", price);
        System.out.println("DIAMMOND 등급의 할인 금액 : " + diammond);

        // 소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println("gold 등급의 할인 금액 : " + gold);

    }
}
