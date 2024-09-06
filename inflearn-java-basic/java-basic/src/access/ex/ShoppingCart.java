package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount; // 초기값은 0

    // 배열에 상품을 담는 addItem 메서드
    public void addItem(Item item) {
        if (itemCount > 10) {
            System.out.println("카트가 가득 찼습니다.");
        } else {
            items[itemCount++] = item;
            System.out.println("카트에 " + item.getName() + "추가");
        }
    }

    // 배열에 담긴 삼품을 나열하는 displayItems 메서드
    public void displayItems() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명 : " + items[i].getName() + ", 합계 : " + items[i].getTotalPrice());
            totalPrice += items[i].getTotalPrice();
        }
        System.out.println("전체 가격 합 : " + totalPrice);
    }
}
