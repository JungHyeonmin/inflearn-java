package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();   // default - 같은 패키지
        DefaultClass2 class2 = new DefaultClass2(); // default - 같은 패키지
    }
}

class DefaultClass1 {

}

class DefaultClass2 {

}
