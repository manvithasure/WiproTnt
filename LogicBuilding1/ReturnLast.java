import java.util.Scanner;
public class ReturnLast{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = n%10;
        if(digit <0)
            digit = -digit;

        System.out.println(digit);
    }
}