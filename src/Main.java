import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Flight> fli = FlightFilter.createFlights();
        Filter fil = new FilterImplementation();

        System.out.println("перелет до текущего момента времени");
        fil.departureToTheCurrentPointInTime(fli);

        System.out.println("перелет с датой прилёта раньше даты вылета");
        fil.arrivalDateIsEarlierThanDepartureDate(fli);

        System.out.println("перелеты, где интервал между прилетом и вылетом превышает 2 часа");
        fil.theIntervalBetweenArrivalAndDepartureExceeds2Hours(fli);

        System.out.println("весь список перелетов");
        fil.allFlightsFromTheList(fli);
    }
}