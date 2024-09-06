package enumeration.ref2;

import static enumeration.ref2.Grade.*;

// 등급별로 할인해 주는 클래스
public class DiscountService {
    public int discount(Grade grade, int price) {
        return (price * grade.getDiscountPercent()) / 100;
    }
}
