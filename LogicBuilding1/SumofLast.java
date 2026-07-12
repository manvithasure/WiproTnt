import java.util.Scanner;
public class SumofLast{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int d1 = n1%10;
        int d2 = n2%10;
        if(d1 < 0){
            d1 = -d1;
        }
        if(d2 <0){
            d2 = -d2;
        }
        System.out.println(d1+d2);
    }
}