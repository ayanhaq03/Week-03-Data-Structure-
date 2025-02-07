package input_stream_reader.convert_byte_stream;
import java.io.*;
public class byteStreamTocharStream {

    public static void main(String[] args) {
        // File containing data in a specific charset (UTF-8)
        String fileName = "example.txt";

        // Try-with-resources ensures proper closing of resources
        try (FileInputStream fis = new FileInputStream(fileName);
             // Convert byte stream to character stream with UTF-8 encoding
             InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Print each line to the console
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handle file reading and encoding exceptions
            e.printStackTrace();
        }
    }
}
