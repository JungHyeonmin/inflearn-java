package enumeration.ref3;

// 등급별로 할인해 주는 클래스
public class DiscountService {
    public int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}
