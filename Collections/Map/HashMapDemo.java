import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("101", "Apple");
        map.put("102", "Banana");
        map.put("103", "Orange");
        map.put("104", "Mango");
        System.out.println("Key 102 exists: " + map.containsKey("102"));
        System.out.println("Key 105 exists: " + map.containsKey("105"));
        System.out.println("Value Mango exists: " + map.containsValue("Mango"));
        System.out.println("Value Grapes exists: " + map.containsValue("Grapes"));
        System.out.println("\nHashMap Elements:");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}