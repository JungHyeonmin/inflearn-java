package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class castingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // 자바 16 - Pattern Matching for instanceof
        // Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) { // child 변수 선언
            System.out.println("Child 인스턴스 맞음");
            child.childMethod(); // 초기화 없이 바로 실행
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
