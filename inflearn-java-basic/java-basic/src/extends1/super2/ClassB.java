package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        //super(); // 부모의 기본 생성자는 생략 가능 (자바가 알아서 만들어 줌)
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        //super(); // 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a = " + a + ", b = " + b);
    }
}