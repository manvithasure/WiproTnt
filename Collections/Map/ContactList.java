import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        // Adding contacts
        contacts.put("Ravi", 987654321);
        contacts.put("Anu", 912345678);
        contacts.put("Rahul", 998877665);
        contacts.put("Priya", 987123456);

        // Check if a key exists
        System.out.println("Key 'Anu' exists: " + contacts.containsKey("Anu"));
        System.out.println("Key 'Kiran' exists: " + contacts.containsKey("Kiran"));

        // Check if a value exists
        System.out.println("Phone Number 998877665 exists: " + contacts.containsValue(998877665));
        System.out.println("Phone Number 111111111 exists: " + contacts.containsValue(111111111));

        // Display contacts using Iterator
        System.out.println("\nContact List:");

        Iterator<Map.Entry<String, Integer>> it = contacts.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}