package BinaryIo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStreamdemo {
    public static void main(String[] args) {
        //by using try with resources we can automatically closes the resources and there is no need of close() method
        try {
            try (//creating the object of FileOutputStream to write the byte data in the file
            //if no file exists then the new file is crearted by this object
            FileOutputStream input =new FileOutputStream("D:\\PROGRAMING_CODES\\binary.dat");){
            
            
            //writing the data in the file using write method
            for (int i=0; i<10; i++){
                input.write(i);
            }
        }
    } catch (Exception e) {
        System.out.println("file not found");
    }
    
    
    
    //by using try with resources we can automatically closes the resources and there is no need of close() method
    try {
        try(//creating the object of the FileInputStream
        FileInputStream output=new FileInputStream("D:\\PROGRAMING_CODES\\binary.dat")){
                //reading data from the byte file           
                int value;
                while ((value = output.read()) != -1)
                System.out.print(value + " ");
        }
        } catch (Exception e) {
            System.out.println("file not found");
        }
    }   
    
}
