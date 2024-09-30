public class Main {
    public static void main(String[] args) {
        
        Library library = new Library();

        
        Book book1 = new Book("And Then There Were None", "Agatha Christie", "12345");
        Book book2 = new Book("As I Lay Dying", "William Faulkner", "67890");
        library.addBook(book1);
        library.addBook(book2);
 
        User user1 = new User("Eya", 27);
        User user2 = new User("Atiya", 20);
        library.addUser(user1);
        library.addUser(user2);
        
        library.borrowBook(user1, "And Then There Were None");
        library.borrowBook(user2, "As I Lay Dying");

        System.out.println("\n--- Available Books ---");
        library.listAvailableBooks();

        System.out.println("\n--- Borrowed Books ---");
        library.getBorrowedBooksForAllUsers();

        System.out.println("\n--- Due Dates ---");
        user1.checkDueDates();
        user2.checkDueDates();

        System.out.println("\n--- Overdue Books ---");
        user1.checkOverdueBooks();
        user2.checkOverdueBooks();
    }
}
