import java.util.Scanner;
public class Gender{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String gender = args[0];
        int age = Integer.parseInt(args[1]);
        if(gender.equalsIgnoreCase("Female")){
            System.out.println((age <= 58)?"8.2":"9.2");
        }else{
            System.out.println((age <= 58)?"8.4":"10.5");
        }
    }
}