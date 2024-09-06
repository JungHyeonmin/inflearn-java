package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();

        // 단 자식의 기능은 호출할 수 없다.
        // poly.childMethod();

        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅한다.
        // 연산자가 .(dot)부터 적용되기 때문에 ( )를 이용한다.
        ((Child) poly).childMethod();
    }
}
