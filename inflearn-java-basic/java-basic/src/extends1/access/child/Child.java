package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call() {
        
        publicValue = 1; // 전부 가능
        protectedValue = 1; // 상속 관계 or 같은 패키지
        // defaultValue = 1; // 다른 패키지 접근 불가, 컴파일 오류
        // privateValue = 1; // 접근 불가, 컴파일 오류

        publicMethod(); // 전부 가능
        protectedMethod(); // 상속 관계 or 같은 패키지
        // defaultMethod(); // 다른 패키지 접근 불가, 컴파일 오류
        // privateMethod(); // 접근 불가, 컴파일 오류

        printParent(); // public 메서드로 들어가서 내부에서 호출하기 때문에 전부 출력된다.

    }
}