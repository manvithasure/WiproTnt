import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

class CountryMap {

    Hashtable<String, String> M1 = new Hashtable<>();

    // Step 1
    public Hashtable<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    // Step 2
    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    // Step 3
    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // Step 4
    public Hashtable<String, String> reverseMap() {
        Hashtable<String, String> M2 = new Hashtable<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }

        return M2;
    }

    // Step 5
    public ArrayList<String> getCountryList() {
        return new ArrayList<>(M1.keySet());
    }
}

public class HashMapDemo1 {

    public static void main(String[] args) {

        CountryMap obj = new CountryMap();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");
        obj.saveCountryCapital("France", "Paris");

        System.out.println("Country -> Capital");
        System.out.println(obj.M1);

        System.out.println("\nCapital of India: " + obj.getCapital("India"));

        System.out.println("Country of Tokyo: " + obj.getCountry("Tokyo"));

        System.out.println("\nCapital -> Country");
        System.out.println(obj.reverseMap());

        System.out.println("\nCountry List");
        System.out.println(obj.getCountryList());
    }
}