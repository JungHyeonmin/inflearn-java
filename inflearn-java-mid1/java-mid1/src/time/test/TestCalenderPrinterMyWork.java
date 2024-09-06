package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalenderPrinterMyWork {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        // 1. 년도와 월을 입력받는다.
        System.out.print("년도를 입력하세요 : ");
        int year = stdIn.nextInt();

        System.out.print("월을 입력하세요 : ");
        int month = stdIn.nextInt();

        LocalDate thisMonthFirstDay = LocalDate.of(year, month, 1);

        // 2. 요일을 나열하는 print문 작성
        System.out.println("Su Mo Tu We Th Fr Sa");

        // 3. 시작하는 요일에 맞추기 위해 띄어쓰기하는 코드 작성
        // DayOfWeek는 각 요일별로 1(월)~7(일)까지의 값을 가지고 있으므로 이용한다.
        for (int i = 0; i < thisMonthFirstDay.getDayOfWeek().getValue(); i++) {
            // 글씨 2자리 + 띄어쓰기 1자리 = 3자리를 띄어쓴다.
            System.out.print("   ");
        }

        // 4. 요일을 각 자리에 맞게 반복하는 코드 작성
        // 반복은 첫째 날 부터 다음 날 마지막 날 전까지 반복
        LocalDate nextMonthOfFirstDay = thisMonthFirstDay.with(TemporalAdjusters.firstDayOfNextMonth());

        while (thisMonthFirstDay.isBefore(nextMonthOfFirstDay)) {
            System.out.printf("%2d ", thisMonthFirstDay.getDayOfMonth());

            // 토요일마다 한칸 밑으로 내리기
            if (thisMonthFirstDay.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            // 다음날 넘어가기
            thisMonthFirstDay = thisMonthFirstDay.plusDays(1);
        }
    }
}