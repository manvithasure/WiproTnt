import java.util.HashSet;
import java.util.Iterator;

public class CountrySet {

    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {

        Iterator<String> itr = H1.iterator();

        while (itr.hasNext()) {
            String country = itr.next();

            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        CountrySet obj = new CountrySet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("Australia");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Canada");

        System.out.println("Countries : " + obj.H1);

        System.out.println(obj.getCountry("India"));
        System.out.println(obj.getCountry("USA"));
    }
}