package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class testAdjusters {
    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        // 입력받은 월의 첫날 요일과 마지막날 요일을 구해라
        // 코드 작성
        LocalDate localDate = LocalDate.of(year, month, 1);

        DayOfWeek firstDayOfWeek = localDate.getDayOfWeek();
        DayOfWeek lastDayOfWeek = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();


        System.out.println("firstDay = " + firstDayOfWeek);

        System.out.println("lastDay = " + lastDayOfWeek);


    }
}
