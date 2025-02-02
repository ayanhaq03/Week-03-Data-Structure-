package bubble_sort;

public class BubbleSort {

    public static void sort(int arr []){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                //compare and swap
                if(arr[j]<arr[i]){
                    arr[i] = arr[i]^arr[j];
                    arr[j] = arr[i]^arr[j];
                    arr[i] = arr[i]^arr[j];

                }
            }
        }
    }

    public static void main(String[] args) {
       //marks of student stored in array
        int [] marks = {76,87,90,45,78};

        sort(marks);
        for(int i = 0 ;i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }

    }
}
