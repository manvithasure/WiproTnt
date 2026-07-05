import java.util.Scanner;
public class MiddleWay{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        for(int i=0;i<3;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<3;i++){
            b[i] = sc.nextInt();
        }
        int[] c = new int[2];
        c[0] = a[1];
        c[1] = b[1];
        for(int i=0;i<2;i++){
            System.out.print(c[i]+" ");
        }
    }
}