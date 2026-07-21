public class Biggest3d{
    public static void main(String[] args){
        if(args.length != 9){
            System.out.println("Enter 9 numbers");
            return;
        }
        int[][] a = new int[3][3];
        int k =0;
        int max;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j] = Integer.parseInt(args[k++]);
            }
        }
        System.out.println("Given array");
        max = a[0][0];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
                if(a[i][j] > max)
                    max = a[i][j];
            }
            System.out.println();
        }
        System.out.println("Biggest number: "+max);
    }
}