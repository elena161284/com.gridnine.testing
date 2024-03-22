import java.time.LocalDateTime;
import java.util.List;

public interface Filter {

    //метод: перелет до текущего момента времени
    List<Flight> departureToTheCurrentPointInTime(List<Flight> fli);

    //метод: перелет с датой прилёта раньше даты вылета
    List<Flight> arrivalDateIsEarlierThanDepartureDate(List<Flight> fli);

    //метод: перелеты, где интервал межде прилетом и вылетом превышает 2 часа
    List<Flight> theIntervalBetweenArrivalAndDepartureExceeds2Hours(List<Flight> fli);

    //метод: вывод всех сегментов
    void allFlightsFromTheList(List<Flight> fli);
}



