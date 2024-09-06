package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        System.out.println();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent1 = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent1.value);
        parent1.method();

        // 부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value);
        poly.method();

        // 타입이 Parent니까 Parent.Method()일 줄 알았는데
        // Child.Method가 나온다.. 왜일까?
        // => 메서드 오버라이딩!, 변수는 오버라이딩 X
        // 오버라이딩 된 메서드는 항상 우선권을 가진다.
        // 그래서 우선권을 가진 Child.Method()가 실행된다.

    }
}
