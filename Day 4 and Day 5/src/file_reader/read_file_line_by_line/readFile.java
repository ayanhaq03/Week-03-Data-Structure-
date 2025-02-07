package file_reader.read_file_line_by_line;
import java.io.*;
public class readFile {
    public static void main(String[] args) {
        // Specify the file to read
        String fileName = "example.txt";

        // Try-with-resources to ensure automatic resource management
        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            // Read each line until the end of the file
            while ((line = br.readLine()) != null) {
                // Print the line to the console
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handle file not found or reading errors
            e.printStackTrace();
        }

    }
}
