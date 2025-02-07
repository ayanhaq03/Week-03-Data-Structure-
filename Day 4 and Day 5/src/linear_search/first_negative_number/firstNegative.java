package linear_search.first_negative_number;

public class firstNegative {
    //method to find index of a negative number
    public static int firstNegative(int arr []){
         //iterating over array and checking if the number is less than 0
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]<0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr [] = {1,3,57,8,5,23,-18,3};

        System.out.println(firstNegative(arr));
    }
}
