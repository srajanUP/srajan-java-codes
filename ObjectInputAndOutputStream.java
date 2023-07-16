package BinaryIo;
import java.util.*;
import java.io.*;

public class TestObjectOutputStream {
    public static void main(String[] args) {
        
        try (//creating the file stream for input and output
          FileInputStream filei=new FileInputStream("D:\\PROGRAMING_CODES\\binary.dat");
            FileOutputStream fileo=new FileOutputStream("D:\\PROGRAMING_CODES\\binary.dat");
            ObjectOutputStream output=new ObjectOutputStream(fileo);
            ObjectInputStream input=new ObjectInputStream(filei);
            )
             {
           
            // Write a string, double value, and object to the file
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeObject( new java.util.Date());
            
            // Read a string, double value, and object from the file
            String name = input.readUTF();
            double score = input.readDouble();
            java.util.Date date = (java.util.Date)(input.readObject());
            System.out.println(name + " " + score + " " + date);
                    
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
}
