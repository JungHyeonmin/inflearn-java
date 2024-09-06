package pack;

// import pack.a.User; // import로 가져오면 다른 패키지의 클래스명를 사용 가능
// import pack.a.User2;

import pack.a.*; // pack.a 패키지에 있는 모든 클래스를 사용함

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지는 그냥 사용한다.
        User user = new User(); // 다른 패키지로 객체 생성
        User2 user2 = new User2(); // 다른 패키지로 객체 생성
    }
}
