import java.util.Scanner;
public class GreatOfTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        if(n1 > n2)
            System.out.println("Greater number is: "+n1);
        else
            System.out.println("Greater number is: "+n2);
    }
}