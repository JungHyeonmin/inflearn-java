package enumeration.ref1;


// 등급별로 할인해 주는 클래스
public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {

        // 안전 타입 열거형에 타입마다 할인율이 있기 때문에 조건문이 없어도 된다.
        return (price * classGrade.getDiscountPercent()) / 100;
    }
}
