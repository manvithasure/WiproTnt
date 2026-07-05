import java.util.Scanner;
class Reverse2d{
    public static void main(String[] args){
        if(args.length != 4){
            System.out.println("Please enter 4 numbers");
            return;
        }
        int[][] a = new int[2][2];
        int k=0;
        for(int i=0;i<2;i++){
            for(int j =0;j<2;j++){
                a[i][j] = Integer.parseInt(args[k++]);
            }
        }
        System.out.println("The given array : ");
        for(int i=0;i<2;i++){
            for(int j =0;j<2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Reverse arry: ");
        for(int i=1;i>=0;i--){
            for(int j=1;j>=0;j--){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}