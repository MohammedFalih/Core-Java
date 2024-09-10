import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Duration;
import java.time.Period;

public class PeriodDuration {
    public static void checkingPeriod(){
        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.of(2003, 3, 15);
        Period gap = Period.between(date, date1);

        System.out.println("The gap between two dates is a period of: " + gap);
    }

    public static void checkingDuration(){
        LocalTime time1 =  LocalTime.now();
        System.out.println("The current time is: " + time1);
        
        Duration fiveHours = Duration.ofHours(5);
        LocalTime time2 = time1.plus(fiveHours);
        System.out.println("After adding five hours of duration: " + time2);


        Duration gap;
        if (time2.isBefore(time1)) {
            gap = Duration.between(time2, time1).minus(Duration.ofHours(24));
        } else {
            gap = Duration.between(time1, time2);
        }
        System.out.println("The Duration gap between time1 and time2: " + gap);
    }

    public static void main(String[] args) {
        System.out.println("Checking with Period: ");
        PeriodDuration.checkingPeriod();
        System.out.println("Checking with Duration: ");
        PeriodDuration.checkingDuration();
    }
}
