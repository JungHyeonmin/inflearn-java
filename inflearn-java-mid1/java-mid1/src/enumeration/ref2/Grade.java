package enumeration.ref2;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    private Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    } // 생성자에 private 생략 가능

    public int getDiscountPercent() { // getter
        return discountPercent;
    }
}

