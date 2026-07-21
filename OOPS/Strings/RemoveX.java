import java.util.Scanner;
public class RemoveX{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while(s.startsWith("x")){
            s = s.substring(1);
        }while(s.endsWith("x"))
            s = s.substring(0,s.length()-1);
        
        System.out.println(s);
    }
}