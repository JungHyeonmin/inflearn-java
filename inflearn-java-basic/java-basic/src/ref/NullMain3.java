package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // bigData.data에 Data의 참조값을 넣음
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // NullPointerException
        // -> 참조값(x001).null.value : null에 .(dot)을 하면 에러가 발생한다.
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
