package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        // Student 클래스타입의 변수를 생성
        Student student1;
        // Student 인스턴스(객체) 생성 -> 변수에 메모리에 생성된 객체의 주소(객체 참조값)를 저장함
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;


        // Student객체(인스턴스)의 참조값을 배열에 저장
        Student[] students = new Student[]{student1, student2};
        for (Student student : students) {
            System.out.println("이름 : " + student.name + ", 나이 : " + student.age + ", 성적 : " + student.grade);
        }
    }
}
