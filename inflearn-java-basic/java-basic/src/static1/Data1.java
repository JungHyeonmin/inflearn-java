package static1;

public class Data1 {
    public String name;
    public int count;

    public Data1(String name) { // 객체가 만들어질때마다 카운트
        this.name = name;
        count++;
    }
}
