package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        // 다른 패키지의 같은 클래스명을 가진 클래스를 이용시
        // 한개의 패키지를 import했다면 나머지는 풀네임을 적어서 사용해야 한다.
        // 보통 자주 사용하는 애를 import하고 나며지는 풀네임으로 한다.
        pack.b.User userB = new pack.b.User();

    }
}