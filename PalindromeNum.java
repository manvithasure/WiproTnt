import java.util.Scanner;
public class PalindromeNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 =n;
        int rev =0;
        while(n1 != 0){
            int rem = n1 %10;
            rev = rev*10 + rem;
            n1 /= 10;
        }
        if(n == rev){
            System.out.println("Palindrome");
        }else
            System.out.println("Not Palindrome");
    }
}