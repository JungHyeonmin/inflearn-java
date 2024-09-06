package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    private Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    } // 생성자에 private 생략 가능

    public int getDiscountPercent() { // getter
        return discountPercent;
    }

    // 등급별로 할인해 주는 클래스
    public int discount(int price) {
        return (price * getDiscountPercent()) / 100;
    }
}

