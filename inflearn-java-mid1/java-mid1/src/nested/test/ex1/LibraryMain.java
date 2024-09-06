package nested.test.ex1;

public class LibraryMain {
    public static void main(String[] args) {
        // 최대 4권의 도서를 저장할 수 있는 도서관 생성
        Library library = new Library(4);

        library.addBook("책", "저자1");
        library.addBook("책", "저자2");
        library.addBook("책", "저자3");
        library.addBook("자바 ORM 표준 JPA 프로그래밍", "김영한");
        library.addBook("OneMoreThing", "잡스");
        library.showBooks(); // 도서관의 모든 도서 정보 출력
    }
}
