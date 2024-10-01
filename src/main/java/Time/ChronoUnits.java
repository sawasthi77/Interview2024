package Time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChronoUnits {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.plus(1, ChronoUnit.DAYS));

        LocalDate dayOfTheNextMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(dayOfTheNextMonth);

        LocalDate nextSaturday = today.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println(nextSaturday);

    }
}
