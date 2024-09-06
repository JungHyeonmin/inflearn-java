package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        // 인터페이스 다중 구현
        InterfaceA a = new Child(); // 부모는 자식을 담을 수 있다.
        a.methodA();
        a.methodCommon();

        System.out.println();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        System.out.println();

        Child child = new Child();
        child.methodA();
        child.methodB();
        child.methodCommon();
    }

}
