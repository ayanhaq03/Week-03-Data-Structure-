package doubly_linked_list.movie_management_system;

public class doublyLinkedList {

    Movie head;
    Movie tail;

    // Add a movie at the beginning
    void addAtFront(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add a movie at the end
    void addAtEnd(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Add a movie at a specific position
    void addAtPosition(String title, String director, int yearOfRelease, double rating, int position) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (position == 1) {
            addAtFront(title, director, yearOfRelease, rating);
            return;
        }
        Movie temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }
        newMovie.next = temp.next;
        newMovie.prev = temp;
        if (temp.next != null) {
            temp.next.prev = newMovie;
        } else {
            tail = newMovie; // Update tail if added at the end
        }
        temp.next = newMovie;
    }

    // Remove a movie by title
    void removeByTitle(String title) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.title.equals(title)) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Movie with title \"" + title + "\" not found!");
            return;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev; // Update tail if the last node is removed
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    // Search for movies by director or rating
    void searchByDirectorOrRating(String director, double rating) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equals(director) || temp.rating == rating) {
                System.out.println("Found Movie: Title: " + temp.title + ", Director: " + temp.director +
                        ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movies found with Director \"" + director + "\" or Rating " + rating);
        }
    }

    // Display all movies in forward order
    void displayForward() {
        if (head == null) {
            System.out.println("No movies to display!");
            return;
        }
        Movie temp = head;
        System.out.println("Movies in Forward Order:");
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director +
                    ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    // Display all movies in reverse order
    void displayReverse() {
        if (tail == null) {
            System.out.println("No movies to display!");
            return;
        }
        Movie temp = tail;
        System.out.println("Movies in Reverse Order:");
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director +
                    ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

    // Update a movie's rating by title
    void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated successfully for movie \"" + title + "\"!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie with title \"" + title + "\" not found!");
    }
}