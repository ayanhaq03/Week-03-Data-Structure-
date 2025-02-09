package search_a_target_in_large_dataset;


public class compareLinearBinary {
    //method to serach element sequentially
    public static int linearSearch(int [] arr , int t){

        for(int i = 0 ; i <arr.length ; i++ ){
            if(arr[i]==t){
                return i ;
            }
        }
        return -1;
    }
    //method to search element using binary search
    public static int binarySearch(int [] arr , int t){
        int l = 0 ;
        int h = arr.length -1 ;

        while(l<=h){
            int mid = l+(h-l)/2;

            if(arr[mid]==t) return mid;
            else if(arr[mid]<t) l = mid +1 ;
            else h = mid -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = new int[1000];
        int [] arr2 = new int[10000];
        int [] arr3 = new int[1000000];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = i ;
        }
        for(int i = 0 ; i < arr2.length ; i++){
            arr2[i] = i ;
        }
        for(int i = 0 ; i < arr3.length ; i++){
            arr3[i] = i ;
        }


        //calculating time taken by linear search to search an element in dataset of 1000 size
        long startTime = System.nanoTime();
        linearSearch(arr,345);
        long endTime = System.nanoTime();
        System.out.println("total time taken by linear search in 1000 sized dataset is  : " + (endTime-startTime));

        //calculating time taken by binary search to search an element in dataset of 1000 size
        startTime = System.nanoTime();
        binarySearch(arr,345);
         endTime = System.nanoTime();
         System.out.println("total time taken by binary search in 1000 sized dataset is  : " + (endTime-startTime));

        System.out.println("-----------------------------------------------------------------------------------------------------");

        //calculating time taken by linear search to search an element in dataset of 10000 size
         startTime = System.nanoTime();
        linearSearch(arr2,3475);
         endTime = System.nanoTime();
        System.out.println("total time taken by linear search in 10000 sized dataset is  : " + (endTime-startTime));

        //calculating time taken by binary search to search an element in dataset of 10000 size
        startTime = System.nanoTime();
        binarySearch(arr2,3475);
        endTime = System.nanoTime();
        System.out.println("total time taken by binary search in 10000 sized dataset is  : " + (endTime-startTime));

        System.out.println("-----------------------------------------------------------------------------------------------------");

        //calculating time taken by linear search to search an element in dataset of 1000000 size
         startTime = System.nanoTime();
        linearSearch(arr3,347555);
         endTime = System.nanoTime();
        System.out.println("total time taken by linear search in 1000000 sized dataset is  : " + (endTime-startTime));

        //calculating time taken by binary search to search an element in dataset of 1000000 size
        startTime = System.nanoTime();
        binarySearch(arr3,34555);
        endTime = System.nanoTime();
        System.out.println("total time taken by binary search in 1000000 sized dataset is  : " + (endTime-startTime));
    }
}
