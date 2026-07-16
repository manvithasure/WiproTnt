import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class RemDays {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate lastDay = LocalDate.of(today.getYear(), 12, 31);
        long daysLeft = ChronoUnit.DAYS.between(today, lastDay);
        System.out.println("Today's Date: " + today);
        System.out.println("Days left in the current year: " + daysLeft);
    }
}