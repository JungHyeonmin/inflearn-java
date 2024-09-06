package extends1.ex;

public class Book extends Item {
    private String name, author, isbn;
    private int price;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("- 저자 : " + author + ", isbn = " + isbn);
    }
}
