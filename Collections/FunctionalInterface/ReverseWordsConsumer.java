import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
public class ReverseWordsConsumer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter 10 words:");
        for (int i = 0; i < 10; i++) {
            list.add(sc.next());
        }
        Consumer<ArrayList<String>> reverse = l -> {
            for (int i = 0; i < l.size(); i++) {
                String rev = new StringBuilder(l.get(i)).reverse().toString();
                l.set(i, rev);
            }
        };
        reverse.accept(list);
        System.out.println("Updated ArrayList:");
        System.out.println(list);
        sc.close();
    }
}