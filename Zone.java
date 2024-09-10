import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Zone {

    public static void ZonedTimeAndDate() {

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println("The current zone is: " + currentZone.getZone());

        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);
        System.out.println("Tokyo timezone is:" + tokyoZone);

        ZoneId malaysia = ZoneId.of("Asia/Kuala_Lumpur");
        ZonedDateTime malaysiaZone = currentZone.withZoneSameInstant(malaysia);
        System.out.println("Malaysia Time Zone: " + malaysiaZone);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String malaysiaFormatted = malaysiaZone.format(formatter2);
        System.out.println("Malaysian formatted date time: " + malaysiaFormatted);
    }

    public static void main(String[] args) {
        System.out.println("\nZoned Time Zone: ");
        Zone.ZonedTimeAndDate();
    }
}
