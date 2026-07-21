import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Function;
public class SumFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        Function<ArrayList<Integer>, Integer> sum = numbers -> {
            int total = 0;
            for (int n : numbers) {
                total += n;
            }
            return total;
        };
        int result = sum.apply(list);
        System.out.println("Sum = " + result);
        sc.close();
    }
}