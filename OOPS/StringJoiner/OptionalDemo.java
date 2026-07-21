import java.util.Optional;
import java.util.Scanner;
public class OptionalDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String names[] = new String[5];
        names[0] = sc.nextLine();
        Optional<String> op = Optional.ofNullable(names[0]);
        if(op.isPresent()){
            System.out.println(names[0].length());
        }else{
            System.out.println("Name is null");
        }
    }
}