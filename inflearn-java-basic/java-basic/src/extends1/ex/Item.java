package extends1.ex;

public class Item {
    private String name;
    private static int price;

    private static int totalPrice;

    public Item(String name, int price) {
        this.price = price;
        this.name = name;
        totalPrice += price;
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println("이름 : " + name + ", 가격 : " + price);
    }

    public static void sum() {
        System.out.println("상품 가격의 합 : " + totalPrice);
    }

}
