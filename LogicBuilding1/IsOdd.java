import java.util.Scanner;
public class IsOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        int c=0;
        for(int i=0;i<5;i++){
            if(a[i]%2 != 0)
                c++;
        }
        System.out.println(c);
        
    }
}