package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalenderPrinter {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("년도를 입력하세요 : ");
        int year = stdIn.nextInt();

        System.out.print("월을 입력하세요 : ");
        int month = stdIn.nextInt();

        printCalender(year, month);

    }

    private static void printCalender(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        // 시작일
        System.out.println("firstDayOfMonth = " + firstDayOfMonth);
        // 종료일
        System.out.println("firstDayOfNextMonth = " + firstDayOfNextMonth);

        // 시작일이 무슨 요일인지 확인하는 코드
        // 달의 첫번째날의.요일을 반환하고.값을 얻는다.(월요일 = 1, 2,3,4,... 일요일 = 7)
        // 월요일 = 1(1%7 = 1) ... 일요일7(7%7 = 0)
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa ");

        // 시작일에 맞춰서 일정 칸 띄우고 시작하기 위한 반복문
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        // 첫번째 날의 정보를 변수에 전달
        LocalDate dayItertor = firstDayOfMonth;
        // 다음달 첫번째 날이랑 isBefore로 비교해서 반복문 실행
        while (dayItertor.isBefore(firstDayOfNextMonth)) {
            // 현재 일을 출력 후 다시 전달
            System.out.printf("%2d ", dayItertor.getDayOfMonth());

            // 만약 토요일이면 한칸 내려간다.
            if (dayItertor.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayItertor = dayItertor.plusDays(1);
        }
    }
}
