package nested.nested.anonymous.ex1;

import java.util.Random;

public class Ex1RefMainV5 {

    public static void hello(Process p) {
        System.out.println("프로그램 시작");
        p.run();
        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {
        // dice
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        });

        // sum
        hello(() -> {
            for (int i = 0; i <= 3; i++) {// 변하지 않는 부분
                System.out.println("i = " + i);
            }
        });
    }
}