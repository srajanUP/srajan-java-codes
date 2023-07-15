package BinaryIo;

import java.io.*;
public class CopyingFilesInjava {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       //surrounding the instance of objects with try-with resources
        try (
         // Create an input stream
         BufferedInputStream input =new BufferedInputStream(new FileInputStream("D:\\PROGRAMING_CODES\\sourcefile.dat"));
        
         // Create an output stream
         BufferedOutputStream output =new BufferedOutputStream(new FileOutputStream("D:\\PROGRAMING_CODES\\target.dat"));
         ) 
         {
         
          // Continuously read a byte from input and write it to output
         int r, numberOfBytesCopied = 0;
         while ((r = input.read()) !=-1) {
            output.write(r);
            numberOfBytesCopied++;
         }
        
         // Display the file size
         System.out.println(numberOfBytesCopied + " bytes copied");
         }
    }
    
}
