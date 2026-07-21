public class PrimeBtw{
    public static void main(String[] args){
        for(int n=10;n<=99;n++){
            int c =0;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i == 0){
                    c++;
                    break;
                }
            }
            if(c == 0){
                System.out.print(n+" ");
            }
        }
    }
}