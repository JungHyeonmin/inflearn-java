package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20); // 기본 생성자가 아닌 것을 만들었기 때문에 오류가 발생한다.
        System.out.println("ClassC 생성자");
    }

    public ClassC(int a) {
        super(a);
    }
}