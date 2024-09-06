package access.ex;

public class Item {
    private String name; // 상품 이름
    private int price; // 가격
    private int quantity; // 수량

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getTotalPrice() { // 상품의 총 가격
        return price * quantity;
    }

}
