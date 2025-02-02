package count_sort;


import java.util.Arrays;

public class countSort {
    // Function to perform Counting Sort
    public static void countingSort(int[] arr, int maxValue) {
        int n = arr.length;
        int[] count = new int[maxValue + 1]; // Count array to store frequency
        int[] output = new int[n]; // Output array to store sorted elements

        // Count the occurrences of each element
        for (int num : arr) {
            count[num]++;
        }

        // Compute cumulative frequency
        for (int i = 1; i <= maxValue; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in sorted order
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy sorted elements back to original array
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 18, 12, 14, 10, 16};
        int maxAge = 18; // Maximum possible age (range is 10 to 18)

        countingSort(studentAges, maxAge);
        System.out.println("Sorted Student Ages: " + Arrays.toString(studentAges));
    }
}

