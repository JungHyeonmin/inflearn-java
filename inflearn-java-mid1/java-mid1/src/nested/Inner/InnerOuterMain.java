package nested.Inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOnter outer = new InnerOnter();
        // 바깥 클래스의 인스턴스멤버라서 바깥 클래스의 참조를 통해서 들어가야 한다.
        InnerOnter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}
