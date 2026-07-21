import java.util.Scanner;
public class EvenOddArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int index =0;
        for(int i=0;i<n;i++){
            if(arr[i] % 2 == 0){
                res[index++] = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2 != 0){
                res[index++] = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}