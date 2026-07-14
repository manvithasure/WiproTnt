import java.util.Scanner;
public class MyClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        WordCount wc = s -> {
            if(s.trim().isEmpty())
                return 0;
            return s.trim().split("\\s+").length;
        };
        System.out.println("Number of words: " + wc.count(str));
        sc.close();
    }
}