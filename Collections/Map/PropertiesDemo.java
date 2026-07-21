import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties p = new Properties();

        // Adding States and Capitals
        p.setProperty("Andhra Pradesh", "Amaravati");
        p.setProperty("Telangana", "Hyderabad");
        p.setProperty("Karnataka", "Bengaluru");
        p.setProperty("Tamil Nadu", "Chennai");
        p.setProperty("Kerala", "Thiruvananthapuram");

        // Using Iterator to display all elements
        Set<Object> keys = p.keySet();
        Iterator<Object> it = keys.iterator();

        System.out.println("States and their Capitals:");

        while (it.hasNext()) {
            String state = (String) it.next();
            System.out.println(state + " -> " + p.getProperty(state));
        }
    }
}