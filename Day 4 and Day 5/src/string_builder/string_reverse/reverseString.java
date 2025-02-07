package string_builder.string_reverse;

public class reverseString {
     public static String reverse(String s){
         //creating stringbuilder object
         StringBuilder st = new StringBuilder();
         //using append method to add string in stringbuilder
         st.append(s);
         //reversing the string using reverse method
         st.reverse();
        return st.toString();

     }
    public static void main(String[] args) {

        System.out.println(reverse("hello"));


    }
}
