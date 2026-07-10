import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringJoiner;
public class NamesJoiner{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter names: ");
        for(int i=0;i<n;i++){
            names.add(sc.next());
        }
        StringJoiner sj = new StringJoiner(", ","{","}");
        names.forEach(name -> sj.add(name));
        System.out.println(sj);
    }
}