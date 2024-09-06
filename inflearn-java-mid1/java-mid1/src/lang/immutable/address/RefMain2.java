package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b.setValue("부산"); // 변경 불가능
        // 어 못바꾸네 새로운 객체(b1)를 만들어야겠다.
        Address b1 = new Address("부산");
        System.out.println("b : 서울 -> 부산");
        // 사이드 이펙트 발생
        System.out.println("a = " + a); 
        System.out.println("b = " + b);
        System.out.println("b1 = " + b1);
    }
}
