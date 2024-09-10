import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

public class TemporalAdj {
    public static void checkingAdjusters() {
        LocalDate date = LocalDate.now();
        System.out.println("The current date is: " + date);

        LocalDate dayofNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("First day of next month: " + dayofNextMonth);

        LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("Next saturday is on: " + nextSaturday);

        LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First day of month: " + firstDay);

        LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of this month: " + lastDay);
    }

    public static void main(String[] args) {
        System.out.println("\nTemporal Adjusters: ");
        TemporalAdj.checkingAdjusters();
    }
}
