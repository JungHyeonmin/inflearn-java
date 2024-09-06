package nested.test.ex1;

public class Library {
    // Library 클래스를 완성해랴
    // Book 클래스는 Library 내부에서만 사용된다.
    // Library 클래스 외부로 노출하면 안된다.
    // Library 클래스는 Book 객체 배열을 사용해서 도서 목록을 관리한다.

    // 코드 작성
    private int bookCount;
    private Book[] books;

    public Library(int size) {
        books = new Book[size];
        bookCount = 0;
    }

    public void addBook(String title, String author) {

        // 김영한씨의 취향 로직

        // 1, 검증 로직을 다 처리하고(예외 처리)
        if (bookCount >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        // 2. 정상 로직을 처리한다.
        books[bookCount++] = new Book(title, author);

        /*
        // if 문으로 4줄 이상이면 불가능
        if (bookCount < books.length) {
            // Book 인스턴스 생성
            books[bookCount++] = new Book(title, author);
        } else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
        */
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목 : " + book.getTitle() + " 저자명 : " + book.getAuthor());
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }
}
