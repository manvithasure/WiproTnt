import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0||n== 1)
            System.out.println("Not Prime");
        int c =0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                c++;
            }
        }
        if(c == 0)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }
}