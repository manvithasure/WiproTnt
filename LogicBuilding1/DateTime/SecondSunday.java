import java.time.DayOfWeek;
import java.time.LocalDate;
public class SecondSunday {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate date = today.plusMonths(1).withDayOfMonth(1);
        while (date.getDayOfWeek() != DayOfWeek.SUNDAY) {
            date = date.plusDays(1);
        }
        LocalDate secondSunday = date.plusDays(7);
        System.out.println("Second Sunday of next month: " + secondSunday);
    }
}