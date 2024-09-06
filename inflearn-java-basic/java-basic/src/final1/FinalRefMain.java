package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        // data = new data(); // 참조값도 새로 초기화 불가능

        // 참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println("data.value = " + data.value);
        System.out.println("참조값 안의 데이터는 변경 가능하다.");
        data.value = 20;
        System.out.println("data.value = " + data.value);
    }
}
