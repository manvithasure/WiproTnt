import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class NegEvenNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        System.out.println("Enter n nums: ");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        List<Integer> res = list.stream().filter(m -> m <0 && m%2 == 0).collect(Collectors.toList());
        System.out.println("Negative even numbers: ");
        res.forEach(System.out::println);
    }
}