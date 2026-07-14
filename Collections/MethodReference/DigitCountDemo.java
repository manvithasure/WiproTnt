import java.util.Scanner;
interface DigitCountInterface{
    int countDigits(int n);
}
class DigitCounter{
    public static int digitCount(int n){
        n = Math.abs(n);
        if (n == 0)
            return 1;
        int count = 0;
        while (n > 0){
            count++;
            n = n / 10;
        }
        return count;
    }
}
public class DigitCountDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        DigitCountInterface d = DigitCounter::digitCount;
        System.out.println("Number of Digits = " + d.countDigits(n));
        sc.close();
    }
}