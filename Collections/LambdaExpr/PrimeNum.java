import java.util.ArrayList;
import java.util.Random;

public class PrimeNum{

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();
        Random random = new Random();

        // Add 25 random numbers (1 to 100)
        for (int i = 0; i < 25; i++) {
            a1.add(random.nextInt(100) + 1);
        }

        System.out.println("ArrayList:");
        System.out.println(a1);

        System.out.println("\nPrime Numbers:");

        a1.forEach(num -> {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        });
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}