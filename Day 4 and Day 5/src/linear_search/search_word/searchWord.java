package linear_search.search_word;

public class searchWord {
    //method to search string in array
    public static String search(String arr[],String s){
        //iterating over array to check whether string exists
        for(int i = 0 ; i <arr.length ; i++){
            if(arr[i].equals(s)) {
                return arr[i];
            }
        }
        //if string is not there return not found
        return "not found";
    }

    public static void main(String[] args) {
        String arr[] = {"hey","hello","ayan"};
        System.out.println(  search(arr,"ayan"));
    }
}
