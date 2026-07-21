import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetDemo{
    public static void main(String[] args){
        TreeSet<String> fruits = new TreeSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Sapota");
        fruits.add("PineApple");
        System.out.println("Tree set: ");
        System.out.println(fruits);
    }
}