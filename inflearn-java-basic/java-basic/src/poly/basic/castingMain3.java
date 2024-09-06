package poly.basic;

public class castingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        // 업캐스팅은 생략 가능, 생략을 권장한다.
        Parent parent1 = (Parent) child;
        // 업캐스팅 생략
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
