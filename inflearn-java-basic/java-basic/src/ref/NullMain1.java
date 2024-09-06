package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data(); // 인스턴스에 참조값을 대입
        System.out.println("2. data = " + data);
        data = null; // 참조값 대신에 null값으로 대입, 메모리 낭비가 된다.
        System.out.println("3. data = " + data);
        data = new Data(); // 참조값을 다시 줘도 다른 참조값이 들어간다.
        System.out.println("4. new data = " + data);

    }
}
