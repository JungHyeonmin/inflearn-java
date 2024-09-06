package class1;

public class ClassStart4 {
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

        System.out.println(student1); // student1객체의 주소값
        System.out.println(student2); // student2객체의 주소값

        Student[] students = new Student[2];
        // Student객체(인스턴스)의 참조값을 배열에 저장
        students[0] = student1;
        students[1] = student2;

        System.out.println();
        System.out.println(students);
        System.out.println(students[0]); // student1객체의 주소값
        System.out.println(students[1]); // student2객체의 주소값

        System.out.println("이름 : " + students[0].name + ", 나이 : " + students[0].age + ", 성적 : " + students[0].grade);
        System.out.println("이름 : " + students[1].name + ", 나이 : " + students[1].age + ", 성적 : " + students[1].grade);
    }
}
