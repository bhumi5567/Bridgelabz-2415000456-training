package Level1this;
class Book {
    private static String libraryName = "City Central Library";
    private String title;
    private String author;
    private final String isbn; 
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid object. Not a Book.");
        }
    }
    public String getIsbn() {
        return isbn;  
    }
    public static void setLibraryName(String newLibraryName) {
        libraryName = newLibraryName;
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book.displayLibraryName();
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "ISBN-12345");
        Book book2 = new Book("1984", "George Orwell", "ISBN-67890");
        book1.displayBookDetails();
        book2.displayBookDetails();
        System.out.println("Book 1 ISBN (using getter): " + book1.getIsbn());
        Book.setLibraryName("National Digital Library");
        System.out.println("\nAfter Changing Library Name:");
        Book.displayLibraryName();
        book1.displayBookDetails();
    }
}


