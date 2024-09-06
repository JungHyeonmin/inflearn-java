package time.test;

import java.time.*;

public class TestZone {
    public static void main(String[] args) {
        // 서울의 회의 시간은 24년 1월 1일 오전 9시이다.
        // 이때 런던, 뉴욕의 회의 시간을 구해라

        // 코드 작성
        LocalDateTime nowldt = LocalDateTime.of(2024, 1, 1, 9, 0, 0);

        ZonedDateTime zdt1 = ZonedDateTime.of(LocalDate.of(2024, 1, 1), LocalTime.of(9, 0), ZoneId.of("Asia/Seoul"));

        // ZonedDateTime zdt1 = ZonedDateTime.of(nowldt, ZoneId.of("Asia/Seoul"));
        ZonedDateTime zdt2 = zdt1.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime zdt3 = zdt1.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간 : " + zdt1);
        System.out.println("런던의 회의 시간 : " + zdt2);
        System.out.println("뉴욕의 회의 시간 : " + zdt3);
    }
}
