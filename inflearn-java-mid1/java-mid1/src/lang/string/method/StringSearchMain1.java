package lang.string.method;

public class StringSearchMain1 {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world.";

        // 해당 범위만큼 문자열 추출
        System.out.println("인덱스 7부터의 부분 문자열 : " + str.substring(7));
        System.out.println("인덱스 7부터의 부분 문자열 : " + str.substring(7, 12));

        System.out.println("문자열 결합 : " + str.concat("!!!"));

        System.out.println("'Java'를 'World'로 대체 : " + str.replace("Java", "World"));
        System.out.println("첫 번째 'Java'를 월드로 대체 : " + str.replaceFirst("Java", "World"));


    }
}
