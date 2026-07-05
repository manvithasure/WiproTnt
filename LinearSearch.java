import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        boolean found = false;
        for(int i=0;i<n;i++){
            if(a[i] == key){
                found = true;
                break;
            }
        }
        if(found == true)
            System.out.println(i);
        else
            System.out.println("-1");
    } 
}