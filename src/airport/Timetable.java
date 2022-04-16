package airport;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Timetable {

    public static void main(String[] args) {
        System.out.printf("", findPlanesLeavingInTheNextTwoHours(Airport.getInstance()));
    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        LocalDateTime localDateTime = LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES);
        LocalDateTime nextTwoHours = localDateTime.plusHours(2);

        Date localDateTimeDate = java.util.Date
                .from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        Date nextTwoHoursDate = java.util.Date
                .from(nextTwoHours.atZone(ZoneId.systemDefault()).toInstant());

        return airport.getTerminals().stream()
                .flatMap(terminal -> terminal.getFlights().stream())
                .collect(Collectors.toList())
                .stream()
                .filter(x -> x.getType().equals(Type.DEPARTURE))
                .filter(t -> (t.getDate().before(nextTwoHoursDate)
                        && t.getDate().after(localDateTimeDate))).collect(Collectors.toList());

    }
}