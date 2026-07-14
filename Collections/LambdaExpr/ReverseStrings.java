import java.util.ArrayList;
import java.util.Collections;
public class ReverseStrings{
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("Apple");
        a1.add("Banana");
        a1.add("Orange");
        a1.add("Mango");
        a1.add("Grapes");
        a1.add("Pineapple");
        a1.add("Cherry");
        a1.add("Guava");
        a1.add("Papaya");
        a1.add("Kiwi");
        Collections.sort(a1, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Strings in Reverse Order:");
        a1.forEach(str -> System.out.println(str));
    }
}