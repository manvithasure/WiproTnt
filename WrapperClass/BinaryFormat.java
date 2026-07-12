import java.util.Scanner;
public class BinaryFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (1-255): ");
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        while (binary.length() < 8) {
            binary = "0" + binary;
        }
        System.out.println(binary);
        sc.close();
    }
}