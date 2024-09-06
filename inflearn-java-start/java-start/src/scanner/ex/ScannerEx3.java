package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요 : ");
        String foodName = stdIn.nextLine();
        System.out.print("음식 가격을 입력해주세요 : ");
        int foodPrice = stdIn.nextInt();
        System.out.print("음식의 수량을 입력해주세요 : ");
        int foodQuantity = stdIn.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(foodName + "의 가격은 " + totalPrice + "입니다.");
    }
}
