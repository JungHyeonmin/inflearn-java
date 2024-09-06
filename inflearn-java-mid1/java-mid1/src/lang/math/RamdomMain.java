package lang.math;

import java.util.Random;

public class RamdomMain {
    public static void main(String[] args) {
        Random random = new Random();
        // Random random = new Random(100); // seed가 같으면 Random(을 500번 돌려도)의 결과가 같다.
        // 마인크래프트에서는 seed값이 같으면 같은 랜덤 지형을 구할 수 있다.
        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10); // 0~9까지 출력
        System.out.println("0~9 : " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1; // 1 ~ 10까지 출력
        System.out.println("1~10 : " + randomRange2);


    }
}
