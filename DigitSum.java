import java.util.Scanner;
public class DigitSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int n1 =n;
        while(n1 !=0){
            int rem = n1 % 10;
            sum += rem;
            n1 /= 10;
        }
        System.out.println(sum);
    }
}