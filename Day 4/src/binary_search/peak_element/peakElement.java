package binary_search.peak_element;


public class peakElement {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Compare mid with its next element
            if (arr[mid] > arr[mid + 1]) {
                right = mid; // Move to left side
            } else {
                left = mid + 1; // Move to right side
            }
        }
        return left; // Peak element index
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println("Peak element index: " + findPeakElement(arr)); // Output: 2
    }
}
