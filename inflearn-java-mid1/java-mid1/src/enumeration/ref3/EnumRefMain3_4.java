package enumeration.ref3;

import static enumeration.ref3.Grade.*;

public class EnumRefMain3_4 {
    public static void main(String[] args) {

        int price = 10000;

        // enum의 모든 상수를 배열에 담는다. - 상수만 추가해도 출력 가능
        Grade [] grades = Grade.values();

        // 반복문으로 할인 금액을 확인한다.
        for (Grade grade : grades) {
            printDiscount(grade,price);
        }

        // Grade grade = new Grade(); // 불가능
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액 : " + grade.discount(price));
    }
}
