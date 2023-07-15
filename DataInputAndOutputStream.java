package BinaryIo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataINputAndOutputStreamDemo {
    public static void main(String[] args) {

        //writing data 
        try(FileOutputStream fileOut=new FileOutputStream("D:\\PROGRAMING_CODES\\binary.dat")) {
            DataOutputStream writing=new DataOutputStream(fileOut);
            writing.writeUTF("John");
            writing.writeDouble(85.5);
            writing.writeUTF("Susan");
            writing.writeDouble(185.5);
            writing.writeUTF("Kim");
            writing.writeDouble(105.25);
            
        } catch (Exception e) {
            System.out.println("file not found");
        }


        //reading data
        try (FileInputStream file = new FileInputStream("D:\\PROGRAMING_CODES\\binary.dat")) {
            DataInputStream input=new DataInputStream(file);
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
        
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
