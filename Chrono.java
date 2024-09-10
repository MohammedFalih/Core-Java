import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
 * ChronoUnit is an enumeration that defines the standard units of time and date,
 * such as seconds minutes, hours, decades etc..
 */

public class Chrono {

    public static void checkingChronoEnum(){
        LocalDate date = LocalDate.now();
        System.out.println("Current date is: " + date);

        LocalDate year = date.plus(2, ChronoUnit.YEARS);
        System.out.println("Next to next year is: " + year);

        LocalDate month = date.plus(4, ChronoUnit.MONTHS);
        System.out.println("After adding 4 months: " + month);

        LocalDate nextweek = date.plus(1, ChronoUnit.WEEKS);
        System.out.println("Next week: " + nextweek);

        LocalDate decade = date.plus(2, ChronoUnit.DECADES);
        System.out.println("After 20years today: " + decade);

        LocalDate lastWeek = date.minus(1, ChronoUnit.WEEKS);
        System.out.println("Last week: " + lastWeek);
    }
    public static void main(String[] args) {
        Chrono.checkingChronoEnum();
    }
    
}