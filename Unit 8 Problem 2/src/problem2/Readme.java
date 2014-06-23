package problem2;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

class  Readme
{
    public static void main(String[] args) 
    {
    	String p = "I pledge allegiance to the Flag of the United States of America, and to the Republic for which it stands: one Nation under God, indivisible, With Liberty and Justice for all";
    	String fileName = "pledge.txt";
        
         try{
        	 RandomAccessFile file = new RandomAccessFile("c:/Users/NateTheGreat/Desktop/pledge.txt", "rw");

             //Writing to the file
             file.writeChars(p);

             
            
//             SHOW 125 AS WELL
             file.seek(126);  

             byte[] bytes = new byte[16];
             file.read(bytes);
             
            	 CharBuffer cBuffer = ByteBuffer.wrap(bytes).asCharBuffer();
//            	 System.out.println(cBuffer.toString());
            	 System.out.println("Reading 16 bytes at character position 126: " + cBuffer.toString());
         
             	System.out.println(file.readChar());
             
//             	SHOW 140
             file.seek(138);  
             char d = file.readChar();
             System.out.println("The char at position 138 is: " + d);
           

             
             file.close();
         } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
