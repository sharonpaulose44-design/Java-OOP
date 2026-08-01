import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

  
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void printBook() {
        System.out.println("\nBook Details");
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();

        Book b1 = new Book(title, author, price);

        b1.printBook();

        sc.close();
    }
}