package enumeration.ex0;


// 등급별로 할인해 주는 클래스
public class DiscountService {
    public int discount(String grade, int price) {
        int discountPercent = 0;

        if (grade.equals("BASIC")) {
            discountPercent = 10;
        } else if (grade.equals("GOLD")) {
            discountPercent = 20;
        } else if (grade.equals("DIAMOND")) {
            discountPercent = 30;
        } else {
            System.out.println(grade + " : 할인X");
        }
        // 10000 * (20/100) -> 2000
        return price * discountPercent / 100;
    }
}
