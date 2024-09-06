package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        // 시간까지 포멧팅
        // 포멧팅 : 날짜를 문자로
        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        System.out.println("now = " + now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("날짜와 시간을 포멧팅 = " + formattedDateTime);

        // 파싱 : 문자를 날짜와 시간으로
        String dateTimeString = "2054-02-02 23:48:57";
        LocalDateTime parseDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("문자를 날짜와 시간으로 = " + parseDateTime);
    }
}
