import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public Library() {
        // Add default books without message
        addBook(new Book("Java Basics", "James Gosling"), false);
        addBook(new Book("Data Structures", "Robert Lafore"), false);
        addBook(new Book("Clean Code", "Robert C. Martin"), false);
        addBook(new Book("Head First Java", "Kathy Sierra"), false);
        addBook(new Book("Effective Java", "Joshua Bloch"), false);
        addBook(new Book("Algorithms", "Sedgewick"), false);
        addBook(new Book("Introduction to AI", "Stuart Russell"), false);
    }

    public void addBook(Book book, boolean showMessage) {
        books.add(book);
        if (showMessage) {
            System.out.println("Book added successfully.");
        }
    }

    public void showAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void issueBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isIssued()) {
                    book.issue();
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book is already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}
