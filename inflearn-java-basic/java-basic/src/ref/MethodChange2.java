package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : a = " + dataA.value); // 10
        changeRefence(dataA);
        System.out.println("메서드 호출 후 : a = " + dataA.value); // 20
    }

    static void changeRefence(Data dataX) { // 메모리에 접근하여 값을 변경
        dataX.value = 20; // 참조값을 타고 들어가서 메모리에 저장된 값을 바꾼다.
    }
}