package construct.ex;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("없음");
        Book a = new Book();

        System.out.println("책 이름, 저자 입력");
        Book b = new Book(stdIn.nextLine(), stdIn.nextLine());

        System.out.println("책 이름, 저자, 페이지 입력");
        Book c = new Book(stdIn.nextLine(), stdIn.nextLine(), stdIn.nextInt());

        a.displayInfo();
        b.displayInfo();
        c.displayInfo();
    }
}
