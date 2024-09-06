package lang.wrapper.test;

import java.util.Random;

public class LottoGenerator {
    private Random random = new Random();
    private int[] arr = new int[6];

    public void saveNum() { // 배열에 랜덤으로 번호 저장
        for (int i = 0; i < 6; i++) {
            int randNum = random.nextInt(45) + 1;

            if (isDup(randNum)) {
                i--;
                continue;
            }

            arr[i] = randNum;
        }
    }

    private boolean isDup(int randNum) { // 중복 확인
        boolean result = false;
        for (int i : arr) {
            if (i == randNum) {
                result = true;
                return result;
            }
        }
        return result;
    }


    public void getArr() { // 번호 출력
        System.out.print("로또 번호 : ");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
