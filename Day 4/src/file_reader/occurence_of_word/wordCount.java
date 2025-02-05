package file_reader.occurence_of_word;



import java.io.*;

public class wordCount {
    public static void main(String[] args) {
        // File to be read
        String fileName = "example.txt";
        // Word to count occurrences
        String targetWord = "hello";
        // Counter to keep track of occurrences
        int count = 0;

        // Try-with-resources ensures the file is closed properly
        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Split the line into words using whitespace as a delimiter
                String[] words = line.split("\\s+");
                // Check each word
                for (String word : words) {
                    // Compare ignoring case
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++; // Increment counter if word matches
                    }
                }
            }

            // Print the total count of occurrences
            System.out.println("The word \"" + targetWord + "\" appears " + count + " times.");
        } catch (IOException e) {
            // Handle file reading errors
            e.printStackTrace();
        }
    }
}

