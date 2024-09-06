package nested.nested.anonymous.ex1;

import java.util.Random;

public class Ex1RefMainV3 {

    public static void hello(Process p) {
        System.out.println("프로그램 시작");

        p.run();

        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {

        Process dice = new Process() {

            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        };

        Process sum = new Process() {

            @Override
            public void run() {
                for (int i = 0; i <= 3; i++) {// 변하지 않는 부분
                    System.out.println("i = " + i);
                }
            }
        };

        hello(dice);
        hello(sum);
    }

}