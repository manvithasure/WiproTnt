import java.util.Scanner;
import java.util.StringJoiner;
public class MergeJoiners{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        StringJoiner s1 = new StringJoiner("-");
        System.out.println("Enter cities: ");
        for(int i=0;i<n1;i++){
            s1.add(sc.next());
        }
        System.out.print("Enter number of cities for s2: ");
        int n2 = sc.nextInt();
        StringJoiner s2 = new StringJoiner("-");
        for(int i=0;i<n2;i++){
            s1.add(sc.next());
        }
        StringJoiner res1 = new StringJoiner("-");
        res1.merge(s2);
        res1.merge(s1);
        StringJoiner res2 = new StringJoiner("-");
        res2.merge(s1);
        res2.merge(s2);
        System.out.println("s1 merged to s2: "+res1);
        System.out.println("s2 merged to s1: "+res2);
    }
}