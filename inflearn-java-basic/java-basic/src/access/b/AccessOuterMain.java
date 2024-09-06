package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능 - 모든 외부 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 default 호출 가능 - 같은 패키지만 호출 가능
        // data.defaultField = 2;
        // data.defaultMethod();

        // private 호출 불가 - 같은 클래스만 호출 가능
        // data.privateField = 3;
        // data.privateMethod();

        data.innerAccess();
    }
}
