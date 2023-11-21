import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, Month.JANUARY, 2);
        LocalTime time = LocalTime.of(13, 20);
        LocalDateTime dateTime= LocalDateTime.of(date,time);
        ZoneId zoneId = ZoneId.of("America/Detroit");
       ZonedDateTime zonedDateTime=ZonedDateTime.of(dateTime,zoneId);
        System.out.println(zonedDateTime);
//        for(String zone1 : ZoneId.getAvailableZoneIds()) {
//             System.out.println(zone1);
        dateTime=dateTime.plusYears(1);
        dateTime=dateTime.plusMonths(1);
        dateTime=dateTime.plusDays(1);
        dateTime=dateTime.plusHours(1);
        dateTime=dateTime.plusMinutes(1);
        zonedDateTime=ZonedDateTime.of(dateTime,zoneId);
        System.out.println(zonedDateTime);

    }
}