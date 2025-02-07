package challenge_problem.performance_comparision;


import java.io.*;

public class performanceComparison {
    public static void main(String[] args) {
        // Compare StringBuilder and StringBuffer performance
        compareStringBuilderAndBuffer();

        // Count words in a large file using FileReader
        countWordsUsingFileReader("largeFile.txt");

        // Count words in a large file using InputStreamReader
        countWordsUsingInputStreamReader("largeFile.txt");
    }

    private static void compareStringBuilderAndBuffer() {
        String word = "hello";
        int iterations = 1_000_000;

        // Using StringBuilder
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(word);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) / 1_000_000 + " ms");

        // Using StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(word);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    private static void countWordsUsingFileReader(String fileName) {
        long startTime = System.nanoTime();
        int wordCount = 0;

        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("FileReader word count: " + wordCount);
        System.out.println("FileReader time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    private static void countWordsUsingInputStreamReader(String fileName) {
        long startTime = System.nanoTime();
        int wordCount = 0;

        try (FileInputStream fis = new FileInputStream(fileName);
             InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while ((line = br.readLine()) != null) {
                wordCount += line.split("\\s+").length;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("InputStreamReader word count: " + wordCount);
        System.out.println("InputStreamReader time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
