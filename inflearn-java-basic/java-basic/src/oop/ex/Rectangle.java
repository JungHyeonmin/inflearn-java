package oop.ex;

public class Rectangle {
    int width;          // 가로
    int height;         // 세로

    void area() {       // 넓이
        int area = width * height;
        System.out.println("넓이 : " + area);
    }

    void perimeter() {  // 둘레
        int perimeter = (width + height) * 2;
        System.out.println("둘레 길이 : " + perimeter);
    }

    void square() {     // 정사각형 여부
        if (width == height) {
            System.out.println("정사각형 여부 : " + true);
        } else {
            System.out.println("정사각형 여부 : " + false);
        }
    }

}
