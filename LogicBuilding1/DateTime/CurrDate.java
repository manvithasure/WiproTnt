import java.time.LocalDate;
public class CurrDate{
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        LocalDate after10 = today.plusDays(10);
        System.out.println(today);
        System.out.println(after10);
    }
}