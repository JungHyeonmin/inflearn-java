package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        // Method Chaining
        // 자기 자신의 참조값을(this)를 반환해서 체인처럼 계속 연결해서 사용하는 방법
        // 코드가 간결하고 가독성이 좋다.
        int result = adder.add(1).add(2).add(3).getValue();

/*
        int result = x001.add(2).add(3).getValue();
        int result = x001.add(3).getValue();
        int result = x001..getValue();
*/

        System.out.println("result = " + result);
    }
}
