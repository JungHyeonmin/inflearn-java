package ref;

public class Method2 {
    public static void main(String[] args) {
        // 변수를 만들고 메서드(리턴)를 이용해서 참조값을 대입
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);
        Student student3 = createStudent("학생3", 17, 70);

        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; // 참조값을 반환
    }

    static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    }
}
