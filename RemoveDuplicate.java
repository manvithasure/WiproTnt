import java.util.Scanner;
public class RemoveDuplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int j;
            for(j=0;j<n;j++){
                if(a[i] == a[j])
                    break;
            }
            if(i == j){
                System.out.print(a[i]+" ");
            }
        }
    }
}