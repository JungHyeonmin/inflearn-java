package time;

import java.time.LocalDate;
import java.time.LocalTime;

public class LoclaTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println("현재 시간 = " + nowTime);

        LocalTime ofTime = LocalTime.of(9, 10, 30);
        System.out.println("특정 시간 = " + ofTime);

        LocalTime ofTimePlus = ofTime.plusSeconds(30);
        System.out.println("특정 시간 + 30s = " + ofTimePlus);

    }
}
