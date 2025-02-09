package string_concatenation_performance;

public class concatPerformance {


    public static void main(String[] args) {

        //concating string 1000 times and calculating time
        String s = "hello";
        long startTime = System.nanoTime();
        for(int i = 0 ; i < 1000 ; i++){
            s.concat(s);
        }
        long endTime = System.nanoTime();
        System.out.println("time taken by String to concat 1000 strings is  : "+ (endTime-startTime));
        //concating string 10000 times and calculating time
        String s2 = "hello";
         startTime = System.nanoTime();
        for(int i = 0 ; i < 10000 ; i++){
           s2.concat(s2);
        }
         endTime = System.nanoTime();
        System.out.println("time taken by String to concat 10000 strings is  : "+ (endTime-startTime));

        //concating string 1000000 times and calculating time
        String s3 = "hello";
         startTime = System.nanoTime();
        for(int i = 0 ; i < 1000000; i++){
            s3.concat(s3);
        }
         endTime = System.nanoTime();
        System.out.println("time taken by String to concat 1000000 strings is  : "+ (endTime-startTime));

        System.out.println("-----------------------------------------------------------------------------------");

        //appending string 1000 times and calculating time
        StringBuilder sb = new StringBuilder();
        startTime = System.nanoTime();
        for(int i = 0 ; i< 1000 ; i++ ){
            sb.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("time taken by string builder to concat 1000 strings is : "+ (endTime-startTime));

        //appending string 10000 times and calculating time
        StringBuilder sb2 = new StringBuilder();
        startTime = System.nanoTime();
        for(int i = 0 ; i< 10000 ; i++ ){
            sb2.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("time taken by string builder to concat 10000 strings is : "+ (endTime-startTime));

        //appending string 1000000 times and calculating time
        StringBuilder sb3 = new StringBuilder();
        startTime = System.nanoTime();
        for(int i = 0 ; i< 1000000; i++ ){
            sb3.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("time taken by string builder to concat 1000000 strings is : "+ (endTime-startTime));

        System.out.println("--------------------------------------------------------------------------------------");

        //appending string 1000 times and calculating time
        StringBuffer stb = new StringBuffer();
        startTime = System.nanoTime();
        for(int i = 0 ; i< 1000 ; i++ ){
            stb.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("time taken by string buffer to concat 1000 strings is : "+ (endTime-startTime));

        //appending string 10000 times and calculating time
        StringBuilder stb2 = new StringBuilder();
        startTime = System.nanoTime();
        for(int i = 0 ; i< 10000 ; i++ ){
            stb2.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("time taken by string buffer to concat 10000 strings is : "+ (endTime-startTime));

        //appending string 1000000 times and calculating time
        StringBuilder stb3 = new StringBuilder();
        startTime = System.nanoTime();
        for(int i = 0 ; i< 1000000; i++ ){
            stb3.append("hello");
        }
        endTime = System.nanoTime();
        System.out.println("time taken by string buffer to concat 1000000 strings is : "+ (endTime-startTime));

        System.out.println("--------------------------------------------------------------------------------------");
    }
}
