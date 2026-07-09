public class BirdAnimal{
    public static void main(String[] args){
        Animal a = new Animal();
        System.out.println("Animal: ");
        a.eat();
        a.sleep();
        System.out.println();
        Bird b = new Bird();
        System.out.println("Bird: ");
        b.eat();
        b.sleep();
        b.fly();
    }
}