package access.ex;

import java.util.Scanner;

public class ShoppingCartMain {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();


        while (true) {
            System.out.println("1. 상품 추가 2. 총 가격 확인 3. 종료");
            int choice = stdIn.nextInt();
            stdIn.nextLine(); // 개행 문자 소비

            if (choice == 1) {
                System.out.println("상품명, 가격, 수량을 입력하세요.");

                String name = stdIn.nextLine();
                int price = stdIn.nextInt();
                int quantity = stdIn.nextInt();
                stdIn.nextLine(); // 개행 문자 소비

                Item item = new Item(name, price, quantity);

                cart.addItem(item);
            } else if (choice == 2) {
                cart.displayItems();
            } else if (choice == 3) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("정확한 값을 입력해주세요.");
            }

        }
    }
}
