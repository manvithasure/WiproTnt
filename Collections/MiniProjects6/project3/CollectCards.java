import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CollectCards {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> cards = new HashMap<>();

        int count = 0;

        while (cards.size() < 4) {

            System.out.println("Enter a card :");

            String symbol = sc.next();

            int number = sc.nextInt();

            count++;

            if (!cards.containsKey(symbol)) {
                Card c = new Card(symbol, number);
                cards.put(c.getSymbol(), c.getNumber());
            }
        }

        System.out.println("Four symbols gathered in " + count + " cards.");

        System.out.println("Cards in Set are :");

        TreeMap<String, Integer> sortedCards = new TreeMap<>(cards);

        for (Map.Entry<String, Integer> entry : sortedCards.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        sc.close();
    }
}