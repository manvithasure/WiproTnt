import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

public class WorkerVectorDemo {

    public static void main(String[] args) {

        Vector<Worker> workers = new Vector<>();

        workers.add(new Worker(401, "Ravi", "Software Engineer", 65000));
        workers.add(new Worker(402, "Sneha", "System Analyst", 72000));
        workers.add(new Worker(403, "Karthik", "Team Lead", 85000));
        workers.add(new Worker(404, "Pooja", "HR Executive", 48000));

        System.out.println("******** USING ITERATOR ********");

        Iterator<Worker> itr = workers.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            System.out.println("----------------------------");
        }

        System.out.println("\n******** USING ENUMERATION ********");

        Enumeration<Worker> en = workers.elements();

        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
            System.out.println("----------------------------");
        }
    }
}