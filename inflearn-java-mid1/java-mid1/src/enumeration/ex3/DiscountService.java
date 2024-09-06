package enumeration.ex3;


import static enumeration.ex3.Grade.*;

// 등급별로 할인해 주는 클래스
public class DiscountService {
    public int discount(Grade classGrade, int price) {
        int discountPercent = 0;

        // 각 객체의 참조값을 비교해서 비교한다.
        if (classGrade == BASIC) { // Xoo1
            discountPercent = 10;
        } else if (classGrade == GOLD) { // == Xoo2
            discountPercent = 20;
        } else if (classGrade == DIAMOND) { // == Xoo3
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }
        return price * discountPercent / 100;
    }
}
