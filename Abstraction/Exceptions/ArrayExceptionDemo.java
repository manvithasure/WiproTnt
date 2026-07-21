import java.util.Scanner;
public class ArrayExceptionDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int n = Integer.parseInt(sc.nextLine());
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(sc.nextLine());
            }
            System.out.println("Index: ");
            int index = Integer.parseInt(sc.nextLine());
            System.out.println("Array element at: "+index+" = "+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }
        catch(NumberFormatException e){
            System.out.println("java.lang.NumberFormatException");
        }
    }
}