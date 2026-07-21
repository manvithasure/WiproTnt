import java.util.Scanner;
public class RemoveFirstLast{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.substring(1,s.length()-1));
    }
}