package binary_search.rotation_point;




public class rotationPoint {
    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than rightmost element, search right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else { // Otherwise, search left half
                right = mid;
            }
        }
        return left; // The index of the smallest element (rotation point)
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Rotation point index: " + findRotationPoint(arr)); // Output: 4
    }
}
