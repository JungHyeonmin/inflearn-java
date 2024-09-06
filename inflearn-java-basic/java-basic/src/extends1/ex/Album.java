package extends1.ex;

public class Album extends Item {
    private String name, artist;
    private int price;

    public Album(String name, int price, String artist) {
        super(name,price);
        this.name = name;
        this.artist = artist;
        this.price = price;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("- 아티스트 : " + artist);
    }

}
