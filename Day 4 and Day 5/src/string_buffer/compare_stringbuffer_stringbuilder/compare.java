package string_buffer.compare_stringbuffer_stringbuilder;

public class compare {

    public static void main(String[] args) {

        //creating stringbuilder and stringbuffer objects
        StringBuffer st = new StringBuffer();
        StringBuilder st2 = new StringBuilder();


        long startTime = System.nanoTime();
        //appending hello million times
        for(int i = 0 ; i < 1000000 ; i++) {
            st.append("hello");
        }
        long endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;
       System.out.println("time taken by string buffer " + stringBufferTime);


        long startTime1 = System.nanoTime();
        //appending hello million times
        for(int i = 0 ; i < 1000000 ; i++){
            st2.append("hello");
        }
        long endTime1 = System.nanoTime();
        long stringBuilderTime = endTime1 - startTime1;
        System.out.println("time taken by stringbuilder " + stringBuilderTime);


        System.nanoTime();


    }

}
