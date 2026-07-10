import java.util.Scanner;
public class RemoveStar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int index = s.indexOf('*');
        String res = s.substring(0,index-1)+s.substring(index+2);
        System.out.println(res);
    }
}