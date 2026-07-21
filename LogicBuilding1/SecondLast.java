import java.util.Scanner;
public class SecondLast{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = (n/10)%10;
        if(digit <0)
            digit = -digit;
        if(n >= -9 && n <= 9)
            System.out.println(-1);
        else
            System.out.println(digit);
    }
}