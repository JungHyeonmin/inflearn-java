package static2;

public class DecoMain {
    public static void main(String[] args) {
        String s = "hello Java";

        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);

        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}