package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        // 코드 작성

        System.out.println("시작 날짜 : " + startDate);
        System.out.println("목표 날짜 : " + endDate);

        Period period = Period.between(startDate, endDate);
        long days = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("남은 기간 : "+period.getYears()+"년 " + period.getMonths() + "개월 " + period.getDays() + "일");
        System.out.println("더한 날짜 : " + days + "일 남음");
    }
}
