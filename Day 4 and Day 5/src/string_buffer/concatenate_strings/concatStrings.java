package string_buffer.concatenate_strings;

import java.sql.SQLOutput;

public class concatStrings {

    public static String concat(String [] s ){

        //creating stringbuffer object
        StringBuffer st = new StringBuffer();

        //concating all strings in array
        for(int i = 0 ; i<s.length ; i++){
            st.append(s[i]);
        }

        return st.toString();
    }
    public static void main(String[] args) {

        String [] s = {"hey","there","bridgelab"};
        System.out.println(concat(s));
    }
}
