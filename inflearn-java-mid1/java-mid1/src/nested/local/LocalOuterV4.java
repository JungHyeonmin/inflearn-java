package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer { // 메서드 내부에 클래스 생성
            int value = 0; // 지역 클래스의 인스턴스(멤버) 변수

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수보다 오래 살아남는다.
                System.out.println("localVar = " + localVar); // 지역변수
                System.out.println("paraVar = " + paramVar); // 매개변수
                System.out.println("outInstanceVar = " + outInstanceVar); // 클래스 변수
            }
        }

        LocalPrinter printer = new LocalPrinter();
        // printer.print(); // 를 샐행하지 않고 Printer인스턴스만 반환한다.
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV4 localOuter = new LocalOuterV4();
        Printer printer = localOuter.process(2);

        // printer.print()를 나중에 실행한다.
        // process()의 스택 프레임이 사라진 후에 실행
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
    }
}
