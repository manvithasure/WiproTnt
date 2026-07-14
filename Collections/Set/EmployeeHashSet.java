import java.util.HashSet;
import java.util.Iterator;
public class EmployeeHashSet{
    public static void main(String[] args){
        HashSet<String> employees = new HashSet<>();
        employees.add("Rahul");
        employees.add("Priya");
        employees.add("Kiran");
        employees.add("Sneha");
        employees.add("Manvitha");
        Iterator<String> itr = employees.iterator();
        System.out.println("Employee Names : ");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}