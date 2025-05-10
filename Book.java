//Book Library (Manual Objects) Create a Book class with attributes: title, author, ISBN. In the main() method, create 5 different Book objects manually and display their details using a method showDetails().


public class Book {
    
    String title;
    String author;
    String ISBN;

    void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println();
    }

    public static void main(String[] args) {
    
        Book book1 = new Book();
        book1.title = "The Catcher in the Rye";
        book1.author = "J.D. Salinger";
        book1.ISBN = "978-0-316-76948-0";

        Book book2 = new Book();
        book2.title = "To Kill a Mockingbird";
        book2.author = "Harper Lee";
        book2.ISBN = "978-0-06-112008-4";

        Book book3 = new Book();
        book3.title = "1984";
        book3.author = "George Orwell";
        book3.ISBN = "978-0-452-28423-4";

        Book book4 = new Book();
        book4.title = "Moby Dick";
        book4.author = "Herman Melville";
        book4.ISBN = "978-0-14-243724-7";

        Book book5 = new Book();
        book5.title = "The Great Gatsby";
        book5.author = "F. Scott Fitzgerald";
        book5.ISBN = "978-0-7432-7356-5";

        book1.showDetails();
        book2.showDetails();
        book3.showDetails();
        book4.showDetails();
        book5.showDetails();
    }
}
