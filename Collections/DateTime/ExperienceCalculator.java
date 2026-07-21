import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class ExperienceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter joining year:");
        int year = sc.nextInt();
        System.out.println("Enter joining month:");
        int month = sc.nextInt();
        System.out.println("Enter joining day:");
        int day = sc.nextInt();
        LocalDate joiningDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        Period experience = Period.between(joiningDate, today);
        System.out.println("Experience in Wipro:");
        System.out.println(experience.getYears() + " Years");
        System.out.println(experience.getMonths() + " Months");
        System.out.println(experience.getDays() + " Days");
    }
}