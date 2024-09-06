package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "hello Java";

        // 객체를 생성 후 메서드 호출
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);

        System.out.println("before : " + s);
        System.out.println("after : " + deco + "\n");

        // 정적 메서드
        String deco2 = DecoUtil2.deco(s);
        System.out.println("before : " + s);
        System.out.println("after : " + deco2);
    }
}