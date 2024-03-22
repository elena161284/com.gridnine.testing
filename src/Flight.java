import java.util.List;
import java.util.stream.Collectors;

public class Flight {


    private final List<Segment> segments;

    Flight(final List<Segment> segs) {
        segments = segs;
    }

    List<Segment> getSegments() {
        return segments;
    }

    @Override
    public String toString() {
        return segments.stream().map(Object::toString)//map(Object::toString)` применяет метод `toString`
                // к каждому элементу списка `segments`, преобразуя их в строки
                .collect(Collectors.joining(" "));//collect(Collectors.joining(" "))` объединяет все
        // полученные строки, разделяя их пробелами, и возвращает итоговую строку.
    }
}
