import java.util.*;   
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileCreation{
    public static void main(String[] args)  {
       //creating a directory object
       File directory =new File("D:/SEMISTER2/fileHandlingDemo/newfile");
       
       //creating the directory/folder
       //mkdir() will create the folder/directory while the mkdirs() will create the directory and the parent folder if it is not created 
       directory.mkdirs();

        // creating a file  object
        File newfile=new File("D:\\SEMISTER2\\fileHandlingDemo\\newfile\\newfile.txt");  // this instance can not create a file
        
        //dealing with exception using try and catch
        try {
        //creating the file using createnewfile method
        newfile.createNewFile();
        }
        // catch block
        catch (IOException e){
            System.out.println("target directory not found!");
        }

        //checking while the file exist or not
        System.out.println("file exist : "+ newfile.exists()); 

        //checking the size of the content in a file
        System.out.println("the size of a file is : "+newfile.length()+" bytes ");

        //check for the readability of a file 
        System.out.println("is file readable : "+newfile.canRead());

        //check for the writability of a file 
        System.out.println("is file writable : "+newfile.canWrite());

        // checking whether it is a folder/directory or not 
        System.out.println("is it a directory : "+newfile.isDirectory());
        
        // checking whether it is a file or not 
        System.out.println("is it a file : "+newfile.isFile());

        //checking whether it is absolute or not
        System.out.println("is it absolute : "+newfile.isAbsolute());

        //checking whether the file is hidden or not
        System.out.println("is file hidden : "+newfile.isHidden());

        //getting the absolute path of the file
        System.out.println("absolute path of the file is : "+newfile.getAbsolutePath());

        //knowing the last modified date and time
        Date date=new Date(newfile.lastModified());   //creating date instanse
        System.out.println("file is last modified on : "+date);


        //deleting the file 
        //System.out.println("is file deleted : "+newfile.delete());

        }
}
