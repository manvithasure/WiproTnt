import java.util.Optional;
import java.util.Scanner;
public class OptionalDemo1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String address = sc.next();
        if(address.equalsIgnoreCase("null")){
            address = null;
        }
        String res = Optional.ofNullable(address).orElse("India");
        System.out.println("Address: "+res);
    }
}