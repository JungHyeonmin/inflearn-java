package ref.ex;


import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요 : ");
        int menu = stdIn.nextInt();

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[menu];

        // 객체 생성
        createOrder(orders, stdIn);

        // 상품 주문 정보
        printOrders(orders);

        // 최종 금액 출력
        System.out.println("총 결제 금액 : " + getTotalAmount(orders));
    }

    // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장 + Scanner의 객체를 받아서 입력받는다.(좋은데?)
    static ProductOrder[] createOrder(ProductOrder[] orders, Scanner stdIn) {
        for (int i = 0; i < orders.length; i++) {
            ProductOrder order = new ProductOrder();
            System.out.println((i + 1) + "번 째 주문 정보를 입력하세요.");

            System.out.print("상품을 입력해주세요. : ");
            order.productName = stdIn.next();

            System.out.print("가격을 입력해주세요. : ");
            order.price = stdIn.nextInt();

            System.out.print("수량을 입력해주세요. : ");
            order.quantity = stdIn.nextInt();

            orders[i] = order;
        }
        return orders;
    }

    // printOrders()를 사용해서 상품 주문 정보 출력
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량" + order.quantity);
        }
    }

    // getTotalAmount()를 사용해서 총 결제 금액 계산
    static int getTotalAmount(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {
            totalPrice += (order.price * order.quantity);
        }
        return totalPrice;
    }

}
