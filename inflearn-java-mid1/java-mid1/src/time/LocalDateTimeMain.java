package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        System.out.println("현재 날짜 시간 = " + nowDt);
        System.out.println("특정 날짜 시간 = " + ofDt);

        System.out.println();
        // 날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();

        System.out.println("localDate = " + localDate);
        System.out.println("localTime = " + localTime);

        System.out.println();
        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        System.out.println();
        // 계산 (불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정 날짜시간 + 1000d = " + ofDtPlus);

        LocalDateTime ofDtYearPlus = ofDtPlus.plusYears(1000);
        System.out.println("지정 날짜시간 + 1000y = " + ofDtYearPlus);

        System.out.println();
        // 비교
        System.out.println("현재 날짜시간이 자정 날짜시간보다 이전인가? " + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 자정 날짜시간보다 이후인가? " + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜시간이 자정 날짜시간이 같은가? " + nowDt.isEqual(ofDt));

        LocalDateTime ofDt1 = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        LocalDateTime ofDt2 = LocalDateTime.of(2016, 8, 16, 8, 10, 1);

        System.out.println(ofDt1.isEqual(ofDt2));
    }
}
