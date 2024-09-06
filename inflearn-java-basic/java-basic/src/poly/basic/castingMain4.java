package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class castingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        // Child child = parent1;       // 불가능
        Child child1 = (Child) parent1; // 캐스팅
        child1.childMethod();           // 문제 없음

        // Parent인스턴스를 만들었기 때문에 메모리에 Child가 존재하지 않는다.
        // 다운캐스팅을 하고 Child에 접근하려고 하지만 메모리에 Child인스턴스가 없어서 오류가 발생한다.
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException
        child2.childMethod();           // 실행 불가


    }
}
