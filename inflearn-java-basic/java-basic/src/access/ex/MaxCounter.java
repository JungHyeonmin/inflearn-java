package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) { // 생성자는 public
        this.max = max;
    }

    public void increment() {
        // 검증 로직
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
        } else {
            count++;
        }
    }

    public int getCount() {
        return count;
    }


}
