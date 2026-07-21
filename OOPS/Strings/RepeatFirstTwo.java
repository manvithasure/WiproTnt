import java.util.Scanner;
public class RepeatFirstTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String first = s.substring(0, 2);
        String res ="";
        for(int i=0;i<s.length();i++){
            res += first;
        }
        System.out.println(res);
    }
}