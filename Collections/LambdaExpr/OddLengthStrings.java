import java.util.ArrayList;
import java.util.Scanner;
public class OddLengthStrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a1 = new ArrayList<>();
        System.out.println("Enter 10 strings:");
        for(int i = 0; i < 10; i++){
            a1.add(sc.nextLine());
        }
        System.out.println("\nStrings with Odd Length:");
        a1.forEach(str ->{
            if(str.length() % 2 != 0){
                System.out.println(str);
            }
        });
        sc.close();
    }
}