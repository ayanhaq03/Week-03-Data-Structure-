package doubly_linked_list.movie_management_system;

public class Main {
    public static void main(String[] args) {
        doublyLinkedList movieList = new doublyLinkedList();

        // Add movies
        movieList.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movieList.addAtEnd("The Dark Knight", "Christopher Nolan", 2008, 9.0);
        movieList.addAtFront("Interstellar", "Christopher Nolan", 2014, 8.6);

        // Display movies
        movieList.displayForward();
        System.out.println();
        movieList.displayReverse();

        // Search for a movie
        movieList.searchByDirectorOrRating("Christopher Nolan", 9.0);

        // Update rating
        movieList.updateRating("Inception", 9.0);

        // Remove a movie
        movieList.removeByTitle("The Dark Knight");

        // Display movies after removal
        movieList.displayForward();
    }
}
