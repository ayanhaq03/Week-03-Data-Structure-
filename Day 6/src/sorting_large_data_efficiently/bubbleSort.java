package sorting_large_data_efficiently;

public class bubbleSort {
    public static void bubbleSort(int arr[]){


        for(int i = 0 ; i < arr.length ;i++){

            for(int j = i +1 ; j<arr.length ; j++){

                if(arr[j]<arr[i]){
                    arr[i] = arr[i]^arr[j];
                    arr[j] = arr[i]^arr[j];
                    arr[i] = arr[i]^arr[j];

                }
            }
        }
    }
}
