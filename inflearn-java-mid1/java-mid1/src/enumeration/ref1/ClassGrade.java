package enumeration.ref1;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(10); // x001
    public static final ClassGrade GOLD = new ClassGrade(20); // x002
    public static final ClassGrade DIAMOND = new ClassGrade(30); // x003

    private final int discountPercent;

    // 생성자 - 값에 할인율을 넣는다.
    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() { // getter
        return discountPercent;
    }
}

