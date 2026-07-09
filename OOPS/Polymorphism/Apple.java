public class Apple extends Fruit{
    public Apple(){
        super("Apple", "Sweet", "Medium");
    }
    public void eat(){
        System.out.println("Fruit: "+name);
        System.out.println("Taste: sweet");
    }
}