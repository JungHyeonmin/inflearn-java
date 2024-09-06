package time;

import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ChronoFiledMain {
    public static void main(String[] args) {
        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
            System.out.println(value + ", range = " + value.range());
        }

        System.out.println();

        System.out.println("ChronoField.MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range());
        System.out.println("ChronoField.DAY_OF_MONTH.range() = " + ChronoField.DAY_OF_MONTH.range());
        System.out.println("ChronoUnit.MONTHS = " + ChronoUnit.MONTHS.getDuration().getSeconds());
    }
}
