package class1.ex;

import java.util.Scanner;

public class ProductOrderMain {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        ProductOrder order1 = new ProductOrder();
        ProductOrder order2 = new ProductOrder();
        ProductOrder order3 = new ProductOrder();

        int totalPrice = 0;

        // 여러 상품의 주문 정보를 담는 배열 생성 - 3개
        ProductOrder[] orders = {order1, order2, order3};

        //상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
        for (int i = 0; i < orders.length; i++) {
            System.out.println("상품명, 가격, 수량을 입력하세요.");
            orders[i].productName = stdIn.next();
            orders[i].price = stdIn.nextInt();
            orders[i].quantity = stdIn.nextInt();
            totalPrice += orders[i].price;
        }

        // 상품 주문 정보와 최종 금액 출력
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량" + order.quantity);
        }
        System.out.println("총 결제 금액 : " + totalPrice);
    }
}
