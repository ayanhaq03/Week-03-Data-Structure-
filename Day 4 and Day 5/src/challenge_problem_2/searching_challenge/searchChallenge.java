package challenge_problem_2.searching_challenge;

import java.util.Arrays;

public class searchChallenge {

    // Linear Search: Find the first missing positive integer
    public static int findFirstMissingPositive(int[] arr) {
        Arrays.sort(arr); // Sort the array first
        int expected = 1; // Start with 1

        for (int num : arr) {
            if (num == expected) {
                expected++; // Move to the next expected integer
            }
        }
        return expected; // First missing positive integer
    }

    // Binary Search: Find target index in sorted array
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println("First missing positive integer: " + findFirstMissingPositive(arr)); // Output: 2

        int[] sortedArr = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        System.out.println("Index of target: " + binarySearch(sortedArr, target)); // Output: 4
    }
}
