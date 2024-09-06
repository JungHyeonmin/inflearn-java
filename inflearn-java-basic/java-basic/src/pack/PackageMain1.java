package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지는 그냥 사용한다.
        pack.a.User user = new pack.a.User(); // 다른 패키지로 객체 생성
    }
}
