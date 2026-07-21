import java.util.Scanner;
public class LargeSmall{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int lar = Integer.MIN_VALUE;
        int seclar = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int secsmall = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i] > lar){
                seclar = lar;
                lar = a[i];
            }else if(a[i] > seclar && a[i] != lar){
                seclar = a[i];
            }
            if(a[i] < small){
                secsmall = small;
                small = a[i];
            }else if(a[i] < secsmall && a[i] != small){
                secsmall = a[i];
            }
        }
        System.out.println("Largest: "+lar+" Second Largest : "+seclar+" Smallest: "+small+" Second Largest: "+secsmall);
    }
}