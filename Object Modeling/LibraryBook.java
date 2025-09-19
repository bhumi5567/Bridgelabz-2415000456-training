package ObjectModeling;
import java.util.ArrayList;
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    ArrayList<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        for (Book book : books) {
            System.out.println(book.title + " by " + book.author);
        }
    }
}

public class LibraryBook {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee");

        Library lib1 = new Library();
        Library lib2 = new Library();

        lib1.addBook(b1);
        lib2.addBook(b2);
        lib2.addBook(b1);

        System.out.println("Library 1 Books:");
        lib1.showBooks();

        System.out.println("Library 2 Books:");
        lib2.showBooks();
    }
}
