package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜 생성 = " + nowDate);

        LocalDate ofDate = LocalDate.of(1999, 2, 2);
        System.out.println("지정 날짜 생성 = " + ofDate);

        // 계산 (불변) - 모든 날짜 클래스는 불변이다.
        // 변경이 발생하는 경우, 새로운 객체를 생성해서 반환해야 하므로 반환값이 필요한다.
        ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10(date) = " + ofDate);
        
        // 객체 생성후 다시 출력 - O
        LocalDate plusDate = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10(date) = " + plusDate);

    }
}
