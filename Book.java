//Class Initialization through Constructor Create a class Book with attributes title and author. Initialize them using a constructor, and print the details using a method showBook().

public class Book {
    String title;
    String author;
    Book(String t, String a) {
        title = t;
        author = a;
    }
    void showBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    public static void main(String[] args) {
        Book myBook = new Book("The Alchemist", "Paulo Coelho");
        myBook.showBook();
    }
}
