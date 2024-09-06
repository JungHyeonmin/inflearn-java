package extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this.value = " + this.value);   // this : 본인 클래스
        System.out.println("super.value = " + super.value); // super : 상위 클래스

        this.hello();
        super.hello();
    }
}
