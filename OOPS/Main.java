public class Main{
    public static void main(String[] args){
        Author a = new Author("James Gosling","james@gmail.com",'M');
        Book b = new Book("Java Programming",a,599.50,20);
        System.out.println("Book Name: "+b.getName());
        System.out.println("Price: "+b.getPrice());
        System.out.println("Quantity: "+b.getQtyInStock());
        System.out.println("Author name: "+b.getAuthor().getName());
        System.out.println("Author email: "+b.getAuthor().getEmail());
        System.out.println("Author gender: "+b.getAuthor().getGender());
    }
}