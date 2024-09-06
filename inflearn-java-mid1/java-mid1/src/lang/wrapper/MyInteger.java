package lang.wrapper;

public class MyInteger {
    private final int value;

    public int getValue() {
        return value;
    }

    public MyInteger(int value) {
        this.value = value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        // valueOf() 메서드를 이용해서 숫자를 문자로 변경
        return String.valueOf(value);
    }


}
