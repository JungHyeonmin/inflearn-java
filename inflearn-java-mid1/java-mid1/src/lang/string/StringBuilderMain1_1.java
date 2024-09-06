package lang.string;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        // 가변 String, StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(1, "Java"); // 인덱스 뒤에 문자열 삽입
        System.out.println("insert = " + sb);

        sb.delete(4,8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        // StringBuilder -> Stromg
        // 가변으로 쓸거 다 쓰고 불변으로 교체
        // 불변 string에 가변 string의 참조값 대입
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}
