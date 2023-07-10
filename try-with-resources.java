//importing the libraries/classes
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class TryWithResources {
    public static void main(String[] args) throws FileNotFoundException {

        //using try with resources to close the resources
        try(
            Scanner input=new Scanner(System.in);     //creating resources for input
            PrintWriter write=new PrintWriter("D:\\SEMISTER2\\newfile\\newfile.txt");) //creating resources for writing in a file
        {
            System.out.println(input.nextLine());

        }
    
    }
}
