package static1;

public class Data2 {
    public String name;


    public Data2(String name, Counter counter) { // 객체가 만들어질때마다 카운트
        this.name = name;
        counter.count++;
    }
}
