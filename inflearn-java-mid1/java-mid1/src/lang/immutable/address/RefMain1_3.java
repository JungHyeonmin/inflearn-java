package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 메서드의 내용은 잘 모르고 그냥 살행
        change(b, "부산");
        // 사이드 이펙트 발생
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {
        System.out.println("주소 값으로 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
