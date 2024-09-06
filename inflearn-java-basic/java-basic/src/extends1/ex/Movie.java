package extends1.ex;

public class Movie extends Item {
    private String name, director, actor;
    private int price;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.name = name;
        this.director = director;
        this.actor = actor;
        this.price = price;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 감독 : " + director + ", 배우 : " + actor);
    }
}
