package BinaryIo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputAndOutputStream{
    public static void main(String[] args) {

        //writing data 
        try(FileOutputStream fileOut=new FileOutputStream("D:\\PROGRAMING_CODES\\binary.dat")) {
            BufferedOutputStream buffer=new BufferedOutputStream(fileOut);
           buffer.write(12456);
           buffer.write(124656);
           buffer.close();


        } catch (Exception e) {
            System.out.println("file not found");
        }


        //reading data
        try (FileInputStream file = new FileInputStream("D:\\PROGRAMING_CODES\\binary.dat")) {
            BufferedInputStream bufferRead=new BufferedInputStream(file);
            System.out.println(bufferRead.read());
            System.out.println(bufferRead.read());
            bufferRead.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
