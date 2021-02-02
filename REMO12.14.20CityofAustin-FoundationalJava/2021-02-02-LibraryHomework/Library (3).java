import java.util.HashMap;

import Book;


/*
Likely has a few small syntax or semantic errors.
 */
public class Library {
    // Add the missing implementation to this class
    private String address;
    private HashMap<String, Book> bookHashMap;

    public Library(String address) {
        this.address = address;
        this.bookArrayList = new HashMap<String, Book>();
    }

    public void addBook(Book book) {
        this.bookHashMap.put(book.getTitle(), book);
    }

    public void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.\n");
    }

    public void printAddress() {
        System.out.println(this.address);
    }

    public void borrowBook(String title) {
        if (bookHashMap.containsKey(title)) {
            if (bookHashMap.get(title).isBorrowed()) {
                System.out.println("Sorry, this book is already borrowed.");
            } else {
                Book book = bookHashMap.get(title);
                book.borrowed();
            }
        } else {
            System.out.println("Sorry, this book is not in our catalog.");
        }
    }

    public void printAvailableBooks() {
        for (String bookTitle : bookHashMap.keySet()) {
            if (!bookHashMap.get(bookTitle).isBorrowed()) {
                System.out.println(bookTitle);
            }
        }
    }



    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}