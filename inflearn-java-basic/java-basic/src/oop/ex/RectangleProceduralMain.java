package oop.ex;

import java.util.Scanner;

// 직사각형의 넓이(Area), 둘레 길이 (Perimeter), 정사각형 여부(Square)를 구하는 프로그램

public class RectangleProceduralMain {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.println("가로와 세로의 길이를 입력하세요.");
        int width = stdIn.nextInt();
        int height = stdIn.nextInt();

        int area = calculateArea(width, height);
        System.out.println("넓이 : " + area);

        int perimeter = calculatePerimeter(width, height);
        System.out.println("둘레 길이 : " + perimeter);

        boolean square = isSquare(width, height);
        System.out.println("정사각형 여부 : " + square);
    }

    static int calculateArea(int width, int height) { // 넓이
        return width * height;
    }

    static boolean isSquare(int width, int height) {
        if (width == height) {
            return true;
        } else {
            return false;
        }
    }

    static int calculatePerimeter(int width, int height) {
        return ((width * 2) + (height * 2));
    }

}
