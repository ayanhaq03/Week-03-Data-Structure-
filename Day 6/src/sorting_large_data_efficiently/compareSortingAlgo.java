package sorting_large_data_efficiently;
import java.util.*;
public class compareSortingAlgo {


    public static void main(String[] args) {
        int [] arr = new int[1000];
        int [] arr2 = new int[10000];
        int [] arr3 = new int[1000000];
        Random random = new Random();

        // Fill the array with random integers (range: 1 to 1000)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000) + 1; // Generates numbers from 1 to 1000
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(10000) + 1; // Generates numbers from 1 to 10000
        }
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = random.nextInt(1000000) + 1; // Generates numbers from 1 to 1000000
        }



        //calculating time taken by bubble sort to sort array of 1000 size
        long startTime = System.nanoTime();
        bubbleSort.bubbleSort(arr);
        long endTime = System.nanoTime();
        System.out.println("total time taken by bubble sort to sort array of 1000 size  : " + (endTime-startTime));

        //calculating time taken by bubble sort to sort array of 10000 size
        startTime = System.nanoTime();
        bubbleSort.bubbleSort(arr2);
        endTime = System.nanoTime();
        System.out.println("total time taken by bubble sort to sort array of 10000 size  : " + (endTime-startTime));

        //calculating time taken by bubble sort to sort array of 1000000 size
        startTime = System.nanoTime();
       // bubbleSort.bubbleSort(arr3);
        endTime = System.nanoTime();
        System.out.println("total time taken by bubble sort to sort array of 1000000 size  : " + (endTime-startTime));
        System.out.println("-----------------------------------------------------------------------------------------------------");


        //calculating time taken by merge sort to sort array of 1000 size
         startTime = System.nanoTime();
mergeSort.mergeSort(arr,0,arr.length-1);
endTime = System.nanoTime();
        System.out.println("total time taken by merge sort to sort array of 1000 size  : " + (endTime-startTime));

        //calculating time taken by merge sort to sort array of 10000 size
        startTime = System.nanoTime();
          mergeSort.mergeSort(arr2,0,arr2.length-1);
        endTime = System.nanoTime();
        System.out.println("total time taken by merge sort to sort array of 10000 size  : " + (endTime-startTime));

        //calculating time taken by merge sort to sort array of 1000000 size
        startTime = System.nanoTime();
        mergeSort.mergeSort(arr3,0,arr3.length-1);
        endTime = System.nanoTime();
        System.out.println("total time taken by merge sort to sort array of 1000000 size  : " + (endTime-startTime));
        System.out.println("-----------------------------------------------------------------------------------------------------");


        //calculating time taken by quick sort to sort array of 1000 size

        startTime = System.nanoTime();
            quickSort.Sort(arr,0,arr.length-1);
         endTime = System.nanoTime();
        System.out.println("total time taken by quick sort to sort array of 1000 size  : " + (endTime-startTime));

        //calculating time taken by quick sort to sort array of 10000 size
        startTime = System.nanoTime();
          quickSort.Sort(arr2,0,arr2.length-1);
           endTime = System.nanoTime();
        System.out.println("total time taken by quick sort to sort array of 10000 size  : " + (endTime-startTime));

        //calculating time taken by quick sort to sort array of 1000000 size
        startTime = System.nanoTime();
        quickSort.Sort(arr3,0,arr3.length-1);
        endTime = System.nanoTime();
        System.out.println("total time taken by bubble sort to sort array of 1000000 size  : " + (endTime-startTime));


    }


}
