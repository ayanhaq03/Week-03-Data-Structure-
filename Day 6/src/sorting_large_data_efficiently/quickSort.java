package sorting_large_data_efficiently;


class quickSort {
    // Partition the array using the last element as pivot
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot element
        int i = low - 1; // Index for smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Place the pivot in its correct position
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Quick Sort function
    public static void Sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort the left and right subarrays
            Sort(arr, low, pi - 1);
            Sort(arr, pi + 1, high);
        }
    }

    // Swap two elements in an array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



}
