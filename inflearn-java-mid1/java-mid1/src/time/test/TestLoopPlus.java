package time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            // System.out.println("날짜 " + (i + 1) + " = " + localDate);
            // localDate = localDate.plusDays(14);
            LocalDate nextDate = localDate.plusWeeks(2 * i);
            System.out.println("날짜 " + (i + 1) + " = " + nextDate);
        }

    }
}
