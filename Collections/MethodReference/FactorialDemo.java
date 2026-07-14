import java.util.Scanner;
interface FactorialInterface{
    int findFactorial(int n);
}
class Factorial{
    public int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
}
public class FactorialDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Factorial obj = new Factorial();
        FactorialInterface f = obj::factorial;
        System.out.println("Factorial: "+f.findFactorial(n));
    }

}