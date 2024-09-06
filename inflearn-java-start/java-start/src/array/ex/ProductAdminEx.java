package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxProducts = 10;
        String[] productName = new String[maxProducts];  // 상품 이름
        int[] productPrices = new int[maxProducts];    // 상품 가격
        int productCount = 0;                       // 상품 개수
        int nameCount = 0;
        int priceCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 입력하세요 : ");

            int menu = scanner.nextInt();

            if (menu == 1 && productCount >= maxProducts) {
                System.out.println("더 이상 상품을 등록할 수 없습니다.");
            } else if (menu == 1) {
                productCount++;

                System.out.print("상품 이름을 입력하세요 : ");
                productName[nameCount++] = scanner.next();
                System.out.print("상품 가격을 입력하세요 : ");
                productPrices[priceCount++] = scanner.nextInt();
            } else if (menu == 2) {
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productName[i] + " : " + productPrices[i]);
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }

    }
}
