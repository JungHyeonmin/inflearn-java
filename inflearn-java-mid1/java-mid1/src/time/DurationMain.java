package time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class DurationMain {

    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = " + duration);

        // 1시라는 localTime 생성
        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = " + lt);

        // 계산에 사용
        LocalTime plusTime = lt.plus(duration);
        System.out.println("더한 시간 : " + plusTime);

        // 시간 차이
        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(10, 59);
        Duration between = Duration.between(startTime, endTime);
        System.out.println("차이 = " + between.getSeconds() + "초");
        System.out.println("근무 시간 : " + between.toHours() + "시간 " + between.toMinutesPart() + "분");
        System.out.println("근무 시간 : " + between.toHours() + "시간 " + between.toMinutes() + "분");
    }
}
