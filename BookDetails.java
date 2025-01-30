import java.util.Scanner;

class Book{
    String title;
    String author;
    double price;
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void DisplayDetails(){
        System.out.println("Book title is :"+title);
        System.out.println("Book author is :"+author);
        System.out.println("Book price is :"+price);
    }
}


public class BookDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String title=sc.next();
        String author=sc.next();
        double price=sc.nextDouble();
        // Book b1=new Book(title,author,price);
        Book b1=new Book(title,author,price);
        b1.DisplayDetails();
    }
}
