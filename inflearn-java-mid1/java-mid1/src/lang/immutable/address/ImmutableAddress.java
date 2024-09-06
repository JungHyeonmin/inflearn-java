package lang.immutable.address;

// 불변 클래스로 변환
public class ImmutableAddress {
    private final String value; // final로 변경

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    // setter 제거 - setter만 없어도 불변객체로 바꿀 수 있다.

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
