import java.util.Scanner;
public class LastN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        String last = s.substring(s.length()-n);
        String res ="";
        for(int i=0;i<n;i++){
            res += last;
        }
        System.out.println(res);
    }
}