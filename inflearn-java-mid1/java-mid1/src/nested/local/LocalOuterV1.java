package nested.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter { // 메서드 내부에 클래스 생성
            int value = 0;

            public void printDate() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paraVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }

        }

        LocalPrinter printer = new LocalPrinter();
        printer.printDate();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
