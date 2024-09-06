package nested.nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // LocalOuterV2와 같은 코드 (지역 클래스 -> 익명 클래스)
        // 익명 클래스  -> 생성과 선언을 동시에 한다.
        Printer printer = new Printer() { // Printer 인터페이스를 생성하면서 구현, 그래서 print()라는 메서드를 Override하는거다.
            int value = 0;


            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paraVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter localOuter = new AnonymousOuter();
        localOuter.process(2);
    }
}
