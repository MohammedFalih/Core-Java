import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void LocalDateTimeApi() {

        LocalDate date = LocalDate.now();
        System.out.println("The current date is: " + date);

        LocalTime time = LocalTime.now();
        System.out.println("The current time is: " + time);

        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current date and time is: " + current);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatedDateTime = current.format(format);
        System.out.println("Formatted Date and Time: " + formatedDateTime);

        Month month = current.getMonth();
        DayOfWeek dayOfWeek = current.getDayOfWeek();
        int day = current.getDayOfMonth();
        int hour = current.getHour();
        int min = current.getMinute();
        int seconds = current.getSecond();
        System.out.println("Month: " + month + ", DayOfWeek: " + dayOfWeek + ", Day: " + day + ", Hour: " + hour + ", Minutes: " + min  + ", Seconds: " + seconds);

        LocalDate date2 = LocalDate.of(2003, 3, 15);
        System.out.println("My DOB: " + date2);

        LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);
        System.out.println("Specific date with current time: " + specificDate);
    }

    public static void main(String[] args) {
        System.out.println("\nLocal Date Time Api");
        Date.LocalDateTimeApi();
    }
}
