import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        String rev = "";
        int n = s.length();
        for(int i=n-1;i>=0;i--){
            rev += s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println(s+" is a Palindrome");
        }else
            System.out.println(s+" is not a Palindrome");
    }
}