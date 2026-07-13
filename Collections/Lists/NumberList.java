import java.util.ArrayList;
public class NumberList{
    public static void main(String[] args){
        ArrayList<Number> list = new ArrayList<>();
        list.add(10);
        list.add(20.5);
        list.add(15.6f);
        list.add(100L);
        System.out.print(list+" ");
    } 
}