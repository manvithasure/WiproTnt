import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
public class PalindromePredicate{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        System.out.println("Enter 10 words:");
        for (int i = 0; i < 10; i++) {
            words.add(sc.next());
        }
        Predicate<String> palindrome = str -> {
            String rev = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(rev);
        };
        System.out.println("Palindrome words:");
        words.stream()
             .filter(palindrome)
             .forEach(System.out::println);
     }

}