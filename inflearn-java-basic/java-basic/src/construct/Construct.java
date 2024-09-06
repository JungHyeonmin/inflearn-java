package construct;

public class Construct {
    String name;
    int age;
    int grade;

    // 추가 - 생성자 오버로딩
    // grade말고 다른 값은 중복이라서 아래의 다른 생성자를 이용한다.
    // 생성자 코드의 첫줄에만 작성할 수 있다.(중복 제거)ㄷ
    Construct(String name, int age) {
        // 생성자에서 생성자를 호출, 생성자 첫줄에서만 사용 가능하다.
        this(name, age, 50); // 아래의 생성자를 이용함
    }

    Construct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    Construct() {
        System.out.println("기본 생성자");
    }
}
