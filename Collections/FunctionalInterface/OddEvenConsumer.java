import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
public class OddEvenConsumer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        Consumer<Integer> check = n -> {
            if (n % 2 == 0)
                System.out.println(n + " even");
            else
                System.out.println(n + " odd");
        };
        list.forEach(check);
        sc.close();
    }
}