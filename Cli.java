import java.util.Scanner;
public class Cli{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(s1+" Technologies "+s2);
        sc.close();
    }
}