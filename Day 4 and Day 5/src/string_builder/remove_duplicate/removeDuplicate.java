package string_builder.remove_duplicate;

import java.util.HashSet;

public class removeDuplicate {

    public static String removeDuplicate(String s){
         //creating stringbuilder object
        StringBuilder st = new StringBuilder();
        //creating hashset object
        HashSet<Character> hs = new HashSet<>();

        for(int i = 0 ; i < s.length();i++){

            if(!hs.contains(s.charAt(i))){
                st.append(s.charAt(i));
                hs.add(s.charAt(i));
            }
        }
        //returning the string without duplicate characters
        return st.toString();
    }
    public static void main(String[] args) {

        System.out.println(removeDuplicate("aabbbcccc"));
    }

}
