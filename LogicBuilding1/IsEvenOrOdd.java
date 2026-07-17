import java.util.Scanner;
public class IsEvenOrOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0;i<5;i++){
            a[i] = sc.nextInt();
        }
        int ec=0;
        int oc = 0;
        for(int i=0;i<5;i++){
            if(a[i]%2 == 0)
                ec++;
            else
                oc++;
        }
        System.out.println(ec);
        System.out.println(oc);
    }
}