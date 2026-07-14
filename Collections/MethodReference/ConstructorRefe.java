import java.util.Scanner;
class PrimeNum{
    PrimeNum(int n){
        boolean prime = true;
        if(n <= 1){
            prime = false;
        }else{
            for(int i=2;i<=n/2;i++){
                if(n%i == 0){
                    prime = false;
                    break;
                }
            }
        }
        if(prime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}
interface PrimeCheck{
    PrimeNum check(int n);
}
public class ConstructorRefe{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int n = sc.nextInt();
        PrimeCheck obj = PrimeNum::new;
        obj.check(n);
    }
}