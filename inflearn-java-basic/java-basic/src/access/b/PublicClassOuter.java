package access.b;

// 임포트를 해도 불가능하다. -> 못찾음
// import access.a.DefaultClass1;
// import access.a.DefaultClass2;
import access.a.PublicClass;

public class PublicClassOuter {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        // 같은 패키지가 아니라서 호출 불가
        // DefaultClass1 defaultClass1 = new DefaultClass1();
        // DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
