package comparing_DS_for_searching;


import java.util.*;

public class dataStructureSearchComparison {
    public static void main(String[] args) {
        int dataSize = 1_000_000; // Change this to test different sizes

        int target = dataSize - 1; // Element to search

        // Generate dataset
        List<Integer> arrayList = new ArrayList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < dataSize; i++) {
            arrayList.add(i);
            hashSet.add(i);
            treeSet.add(i);
        }

        // Measure search time in Array (Linear Search)
        long startTime = System.currentTimeMillis();
        boolean foundInArray = arrayList.contains(target);
        long endTime = System.currentTimeMillis();
        System.out.println("Array Search Time: " + (endTime - startTime) + "ms");

        // Measure search time in HashSet (Constant Time)
        startTime = System.currentTimeMillis();
        boolean foundInHashSet = hashSet.contains(target);
        endTime = System.currentTimeMillis();
        System.out.println("HashSet Search Time: " + (endTime - startTime) + "ms");

        // Measure search time in TreeSet (Logarithmic Time)
        startTime = System.currentTimeMillis();
        boolean foundInTreeSet = treeSet.contains(target);
        endTime = System.currentTimeMillis();
        System.out.println("TreeSet Search Time: " + (endTime - startTime) + "ms");
    }
}
