import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
public class PerfectSquarePredicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        Predicate<Integer> perfectSquare = n -> {
            int root = (int) Math.sqrt(n);
            return root * root == n;
        };
        System.out.println("Perfect square numbers:");
        list.stream()
            .filter(perfectSquare)
            .forEach(System.out::println);
        sc.close();
    }
}