package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A"); // 새로운 객체를 만든다.
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B"); // count = 0;
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // 추가
        // 인스턴스를 통한 접근 - 인스턴스 변수로 오해할 수 있어서 비추천
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);

        // 클래스를 통한 접근
        // - 클래스로 접근하는 걸 보고 스태틱 변수인 걸 알 수 있다.
        System.out.println(Data3.count);
    }
}
