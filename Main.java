import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        int mainChoice;
        do {
            System.out.println("\n=== Welcome to Library Management System ===");
            System.out.println("1. Login as Admin");
            System.out.println("2. Login as User");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            mainChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (mainChoice) {
                case 1:
                    adminPanel(scanner, library);
                    break;
                case 2:
                    userPanel(scanner, library);
                    break;
                case 0:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (mainChoice != 0);

        scanner.close();
    }

    private static void adminPanel(Scanner scanner, Library library) {
        int choice;
        do {
            System.out.println("\n=== Admin Panel ===");
            System.out.println("1. View all books");
            System.out.println("2. Add new book");
            System.out.println("0. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.showAllBooks();
                    break;
                case 2:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author), true);
                    break;
                case 0:
                    System.out.println("Logging out admin...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }

    private static void userPanel(Scanner scanner, Library library) {
        int choice;
        do {
            System.out.println("\n=== User Panel ===");
            System.out.println("1. View all books");
            System.out.println("2. Issue a book");
            System.out.println("3. Return a book");
            System.out.println("0. Logout");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.showAllBooks();
                    break;
                case 2:
                    System.out.print("Enter title to issue: ");
                    String issueTitle = scanner.nextLine();
                    library.issueBook(issueTitle);
                    break;
                case 3:
                    System.out.print("Enter title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 0:
                    System.out.println("Logging out user...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}
