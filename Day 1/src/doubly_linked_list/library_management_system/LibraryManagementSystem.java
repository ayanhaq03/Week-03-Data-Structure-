package doubly_linked_list.library_management_system;

class LibraryManagementSystem {
    private Book head;
    private Book tail;

    // Add a new book at the beginning
    public void addBookAtBeginning(String title, String author, String genre, int bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    // Add a new book at the end
    public void addBookAtEnd(String title, String author, String genre, int bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    // Add a new book at a specific position
    public void addBookAtPosition(String title, String author, String genre, int bookID, boolean isAvailable, int position) {
        if (position == 0) {
            addBookAtBeginning(title, author, genre, bookID, isAvailable);
            return;
        }
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        Book current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newBook.next = current.next;
        newBook.prev = current;
        if (current.next != null) {
            current.next.prev = newBook;
        } else {
            tail = newBook;
        }
        current.next = newBook;
    }

    // Remove a book by Book ID
    public void removeBookByID(int bookID) {
        if (head == null) {
            System.out.println("Library is empty.");
            return;
        }
        if (head.bookID == bookID) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }
        Book current = head;
        while (current != null && current.bookID != bookID) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Book with ID " + bookID + " not found.");
        } else {
            if (current.next != null) {
                current.next.prev = current.prev;
            } else {
                tail = current.prev;
            }
            if (current.prev != null) {
                current.prev.next = current.next;
            }
        }
    }

    // Search for a book by Book Title or Author
    public void searchBook(String title, String author) {
        Book current = head;
        boolean found = false;
        while (current != null) {
            if (current.title.equalsIgnoreCase(title) || current.author.equalsIgnoreCase(author)) {
                System.out.println("Found: " + current.title + " by " + current.author + " (Genre: " + current.genre + "), ID: " + current.bookID + ", Available: " + current.isAvailable);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("No book found with the given title or author.");
        }
    }

    // Update a book's Availability Status
    public void updateAvailabilityStatus(int bookID, boolean isAvailable) {
        Book current = head;
        while (current != null) {
            if (current.bookID == bookID) {
                current.isAvailable = isAvailable;
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    // Display all books in forward order
    public void displayBooksForward() {
        System.out.println("Books in forward order:");
        Book current = head;
        while (current != null) {
            System.out.println(current.title + " by " + current.author + " (Genre: " + current.genre + "), ID: " + current.bookID + ", Available: " + current.isAvailable);
            current = current.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksReverse() {
        System.out.println("Books in reverse order:");
        Book current = tail;
        while (current != null) {
            System.out.println(current.title + " by " + current.author + " (Genre: " + current.genre + "), ID: " + current.bookID + ", Available: " + current.isAvailable);
            current = current.prev;
        }
    }

    // Count the total number of books in the library
    public int countTotalBooks() {
        int count = 0;
        Book current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
