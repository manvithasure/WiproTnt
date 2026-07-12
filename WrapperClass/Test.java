public class Test {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);

        System.out.println("Given Number : " + num);
        System.out.println("Binary equivalent : " + Integer.toString(num, 2));
        System.out.println("Octal equivalent : " + Integer.toString(num, 8));
        System.out.println("Hexadecimal equivalent : " + Integer.toString(num, 16));
    }
}