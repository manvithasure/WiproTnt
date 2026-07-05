import java.util.Scanner;
public class AsciiToChar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Corresponding character values: ");
        for(int i=0;i<n;i++){
            System.out.print((char) a[i]+" ");
        }
    }
}