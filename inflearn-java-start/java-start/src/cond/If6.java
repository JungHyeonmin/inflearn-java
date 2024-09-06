package cond;

public class If6 {
    public static void main(String[] args) {
        {
            int price = 10000;  // 아이템 가격
            int age = 10;       // 나이
            int discount = 0;

            if (10000 <= price) {
                discount += 1000;
                System.out.println("10000원이상 구매, 1000원 할인");
            } else if (10 >= age) {
                discount += 1000;
                System.out.println("어린이 1000원 할인");
            } else {
                System.out.println("할인 없음");
            }
            System.out.println("총 할인 금액 : " + discount + "원");
        }
    }
}
