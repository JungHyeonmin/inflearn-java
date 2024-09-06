package extends1.access;

import extends1.access.child.Child;

public class ExtendsAccessMain {
    public static void main(String[] args) {

        Child child = new Child(); // 다른 패키지지만 import로 사용
        child.call();
    }
}