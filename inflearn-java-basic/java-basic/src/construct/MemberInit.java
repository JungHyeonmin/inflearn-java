package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        // this : 인스턴스 자신의 참조값으 뜻한다.
        //        따라서 인스턴스의 멤버 변수에 접근
        this.name = name; // this : 같은 이름의 멤버 변수에 접근
        this.age = age;
        this.grade = grade;
    }

}
