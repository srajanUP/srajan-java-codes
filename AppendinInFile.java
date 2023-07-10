import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppendingInFile {
    public static void main(String[] args) {
        //taking input from the user 
        Scanner input=new Scanner(System.in);
        System.out.println("enter the text to enter");
        String in=input.nextLine();

                                                  //using FileOutputStream(file,true) to append the data to the existing file
        try(PrintWriter write=new PrintWriter(new FileOutputStream("D:\\SEMISTER2\\newfile\\newfile.txt",true))){    //creating print writer object
            File file=new File("D:\\SEMISTER2\\newfile\\newfile.txt");                    // creating object of file class 
            write.write(in);         // writing in a file
            // write.print(" "+90);  // writing integer input
            write.close();           // closing the file
        }

        catch(Exception e ){
            System.out.println(e);
        }
    
    }
    
}
