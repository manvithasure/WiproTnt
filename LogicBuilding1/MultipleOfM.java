import java.util.Scanner;
public class MultipleOfM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m == 0){
            System.out.println("Division is not possible");
        }
        else if(n % m == 0){
            System.out.println(n+" is an exact multiple of "+m);
        }else   
            System.out.println(n + " is not a multiple of "+m);
    }
}