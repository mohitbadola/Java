// The finally block executes whether exception rise or not and whether exception handled or not. 
// finally block is a block used to execute important code such as closing the connection, etc.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo4 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // int i=1;
        // int j=0;
        // try {
        //     j = 18/i;
        // } catch (Exception e) {
        //     System.out.println("in Exception");
        // }finally{                        
        //     System.out.println("Bye");
        // }

        // BufferedReader br = null;
        // try{
        //     InputStreamReader in = new InputStreamReader(System.in);
        //     br = new BufferedReader(in);
        //     int num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        // }
        // finally{
        //     br.close();
        // }

    
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){  //resource automatically closes ny this
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
