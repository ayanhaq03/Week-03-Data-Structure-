package quick_sort;



import java.util.Arrays;

public class quickSort {
    // Function to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high); // Find pivot index
            quickSort(arr, low, pivotIndex - 1); // Sort left part
            quickSort(arr, pivotIndex + 1, high); // Sort right part
        }
    }

    // Function to partition the array
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // If current element is smaller than pivot, swap it
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high); // Place pivot at correct position
        return i + 1; // Return pivot index
    }

    // Function to swap two elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] productPrices = {400, 150, 600, 200, 350};
        quickSort(productPrices, 0, productPrices.length - 1);
        System.out.println("Sorted Product Prices: " + Arrays.toString(productPrices));
    }
}

