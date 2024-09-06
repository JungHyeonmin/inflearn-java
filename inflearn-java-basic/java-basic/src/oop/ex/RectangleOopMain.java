package oop.ex;

import java.util.Scanner;

public class RectangleOopMain {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("가로, 세로의 길이를 입력하세요.");
        rectangle.width = stdIn.nextInt();
        rectangle.height = stdIn.nextInt();

        // 넓이
        rectangle.area();
        // 둘레
        rectangle.perimeter();
        // 정사각형 여부
        rectangle.square();
    }
}
