package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        // Class helloClass = Hello.class;
        Class helloClass = Class.forName("lang.clazz.Hello");

        // 선택한 생성자로 인스턴스를 생성한다.
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello(); // 생성한 인스턴스의 메서드 hello를 result에 저장
        System.out.println("result = " + result); // result 호출
    }
}
