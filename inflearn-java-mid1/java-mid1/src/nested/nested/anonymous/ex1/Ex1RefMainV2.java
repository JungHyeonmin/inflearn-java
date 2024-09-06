package nested.nested.anonymous.ex1;

import java.util.Random;

public class Ex1RefMainV2 {

    public static void hello(Process p) {
        System.out.println("프로그램 시작");

        p.run();

        System.out.println("프로그램 종료");
    }



    public static void main(String[] args) {
        // 지역 클래스
        class dice implements Process {
            // static이 있으므로 정적 중첩 클래스이다.
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        }

        class sum implements Process {

            @Override
            public void run() {
                for (int i = 0; i <= 3; i++) {// 변하지 않는 부분
                    System.out.println("i = " + i);
                }
            }
        }

        hello(new dice());
        hello(new sum());
    }

}