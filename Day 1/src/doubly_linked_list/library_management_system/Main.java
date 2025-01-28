package doubly_linked_list.library_management_system;

public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Add books to the library
        library.addBookAtEnd("Book1", "Author1", "Fiction", 101, true);
        library.addBookAtBeginning("Book2", "Author2", "Non-Fiction", 102, true);
        library.addBookAtEnd("Book3", "Author3", "Fantasy", 103, false);
        library.addBookAtPosition("Book4", "Author4", "Horror", 104, true, 2);

        // Display books in forward and reverse order
        library.displayBooksForward();
        library.displayBooksReverse();

        // Search for a book
        library.searchBook("Book3", "");

        // Update availability status
        library.updateAvailabilityStatus(103, true);

        // Remove a book by ID
        library.removeBookByID(102);

        // Display books after removal
        library.displayBooksForward();

        // Count total books
        System.out.println("Total number of books: " + library.countTotalBooks());
    }
}
