import java.util.Iterator;
import java.util.TreeSet;
public class CountryTree{
    TreeSet<String> countries = new TreeSet<>();
    public TreeSet<String> saveCountryNames(String countryName) {
        countries.add(countryName);
        return countries;
    }
    public String getCountry(String countryName) {
        Iterator<String> itr = countries.iterator();
        while (itr.hasNext()) {
            String country = itr.next();
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        CountryTree obj = new CountryTree();
        obj.saveCountryNames("India");
        obj.saveCountryNames("Germany");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Brazil");
        System.out.println("Countries");
        System.out.println(obj.countries);
        System.out.println("\nSearching");
        System.out.println(obj.getCountry("Japan"));
        System.out.println(obj.getCountry("China"));
    }
}