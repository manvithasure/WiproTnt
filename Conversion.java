import java.util.Scanner;
public class Conversion{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch +"--> "+(char)(ch-32));
        }else
            System.out.println(ch + " --> "+(char)(ch + 32));
    }
}