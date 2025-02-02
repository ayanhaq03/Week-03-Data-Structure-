package insertion_sort;



import java.util.Arrays;

public class insertionSort {
    // Function to perform Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Pick the current element
            int j = i - 1;

            // Shift elements of sorted part to find the correct position for key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Insert key at the correct position
        }
    }

    public static void main(String[] args) {
        int[] employeeIDs = {105, 102, 108, 101, 103};
        insertionSort(employeeIDs);
        System.out.println("Sorted Employee IDs: " + Arrays.toString(employeeIDs));
    }
}

