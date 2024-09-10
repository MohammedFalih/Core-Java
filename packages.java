import java.util.Date;
import java.time.*;

class Main {
    public static void main(String[] args)
    {
        Date date = new Date();
        LocalDate dateTime = LocalDate.now();
        System.out.println("\nPackages and imports----");
        System.out.println("Date: " + date);
        System.out.println("LocalDate: " + dateTime);

    }
}