import java.util.Scanner;
public class CombineString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String res = "";
        int min = Math.min(a.length(), b.length());
        for(int i=0;i<min;i++){
            res += a.charAt(i);
            res += b.charAt(i);
        }
        if(a.length()> b.length()){
            res += a.substring(min);
        }else{
            res += b.substring(min);
        }
        System.out.println(res);
    }
}