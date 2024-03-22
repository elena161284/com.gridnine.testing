import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterImplementation implements Filter {
    @Override
    public List<Flight> departureToTheCurrentPointInTime(List<Flight> fli) {
        List<Flight> flightsUntilCurrentTime = fli.stream().filter(flight -> flight.getSegments().stream()
                        .anyMatch(segment -> segment.getDepartureDate().isBefore(LocalDateTime.now())))
                .collect(Collectors.toList());
        System.out.println(flightsUntilCurrentTime);
        return flightsUntilCurrentTime;
    }

    @Override
    public List<Flight> arrivalDateIsEarlierThanDepartureDate(List<Flight> fli) {
        List<Flight> arrivalDateEarlierThanDepartureDate = fli.stream().filter(flight -> flight.getSegments().stream()
                        .anyMatch(segment -> segment.getArrivalDate().isBefore(segment.getDepartureDate())))
                .collect(Collectors.toList());
        System.out.println(arrivalDateEarlierThanDepartureDate);
        return arrivalDateEarlierThanDepartureDate;
    }

    @Override
    public List<Flight> theIntervalBetweenArrivalAndDepartureExceeds2Hours(List<Flight> fli) {
        List<Flight> twoHours = new ArrayList<>();
        for (Flight flight : fli) {
            List<Segment> segments = flight.getSegments();
            for (int i = 0; i < segments.size() - 1; i++) {
                LocalDateTime depTime = segments.get(i + 1).getDepartureDate();
                LocalDateTime arrTime = segments.get(i).getArrivalDate();
                if (depTime.isAfter(arrTime.plusHours(2))) ;
                twoHours.add(flight);
            }
        }
        System.out.println(twoHours);
        return twoHours;
    }

    @Override
    public void allFlightsFromTheList(List<Flight> fli) {
        System.out.println(fli);
    }
}

