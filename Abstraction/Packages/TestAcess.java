import test.Foundation;
public class TestAccess{
    public static void main(String[] args){
        Foundation f = new Foundation();
        //System.out.println(f.var1);//private - Not Accessible
        //System.out.println(f.var2);//Default- Not Accessible
        //System.out.println(f.var3);//Protected- Not Accessible
        System.out.println("Public Variable: "+f.var4);
    }
}