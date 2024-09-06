package time.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 01, 01, 00, 00);
        LocalDateTime localDateTime1 = localDateTime.plusYears(1);
        LocalDateTime localDateTime2 = localDateTime1.plusMonths(2);
        LocalDateTime localDateTime3 = localDateTime2.plusDays(3);
        LocalDateTime localDateTime4 = localDateTime3.plusHours(4);
        System.out.println("localDateTime = " + localDateTime4);

        LocalDateTime dateTime = LocalDateTime.of(2024, 01, 01, 00, 00);
        LocalDateTime futureDateTime = dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("futureDateTime = " + futureDateTime);
    }
}
