package hashmap_and_hashFunctions.longest_consecutive_sum;

import java.util.*;

class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        int longest = 0;

        for (int num : arr) {
            if (!set.contains(num - 1)) {  // Start of a new sequence
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr)); // Output: 4 (1,2,3,4)
    }
}

