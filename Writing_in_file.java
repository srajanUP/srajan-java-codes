import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WritingData {
    public static void main(String[] args) {
        //taking input from the user 
        Scanner input=new Scanner(System.in);
        System.out.println("enter the text to enter");
        String in=input.nextLine();


        try(PrintWriter write=new PrintWriter("D:\\SEMISTER2\\newfile\\newfile.txt")){    //creating print writer object
            File file=new File("D:\\SEMISTER2\\newfile\\newfile.txt");                    // creating object of file class 
            write.print(in);  // writing in a file
            //write.write(in);  // also use the write method of the printWriter class to write in a file
            write.close();    //closing the file
        }

        catch(Exception e ){
            System.out.println(e);
        }
    
    }
}
