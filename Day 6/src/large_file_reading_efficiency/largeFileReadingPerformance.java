package large_file_reading_efficiency;


import java.io.*;

public class largeFileReadingPerformance{
    public static void main(String[] args) throws IOException {
        String filePath = "samplefile.txt";

        // Using FileReader (Character Stream)
        long startTime = System.currentTimeMillis();
        try (FileReader fileReader = new FileReader(filePath)) {
            while (fileReader.read() != -1) {} // Reads character by character
        }
        long endTime = System.currentTimeMillis();
        System.out.println("FileReader Time: " + (endTime - startTime) + "ms");

        // Using InputStreamReader (Byte Stream)
        startTime = System.currentTimeMillis();
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            while (inputStreamReader.read() != -1) {} // Reads byte by byte and converts to character
        }
        endTime = System.currentTimeMillis();
        System.out.println("InputStreamReader Time: " + (endTime - startTime) + "ms");
    }
}
