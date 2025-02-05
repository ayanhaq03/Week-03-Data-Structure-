package input_stream_reader.user_input_to_file;


import java.io.*;

public class userInputToFile {
    public static void main(String[] args) {
        // File where user input will be saved
        String fileName = "output.txt";

        // Try-with-resources to automatically close streams
        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter fw = new FileWriter(fileName)) {

            System.out.println("Enter text (type 'exit' to stop):");

            String input;
            // Read user input until they type "exit"
            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                // Write input to the file followed by a new line
                fw.write(input + System.lineSeparator());
            }

            System.out.println("User input has been saved to " + fileName);

        } catch (IOException e) {
            // Handle file writing errors
            e.printStackTrace();
        }
    }
}
