package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        int result = adder.getValue();
        System.out.println("result = " + result);

        // add()메서드가 자기 자신을 반환하기 때문에
        // 모두 같은 인스턴스를 참조한다.
        System.out.println("result = " + adder);
    }
}
