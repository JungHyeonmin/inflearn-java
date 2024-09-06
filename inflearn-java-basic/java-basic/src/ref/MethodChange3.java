package ref;

public class MethodChange3 {
    public static void main(String[] args) {
        Student student1;
    }

    static void changeRefence(Data dataX) { // 메모리에 접근하여 값을 변경
        dataX.value = 20; // 참조값을 타고 들어가서 메모리에 저장된 값을 바꾼다.
    }
}