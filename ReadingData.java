//importing the classes
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadingData {
    public static void main(String[] args) {
        //creating file object
        File file=new File( "D:\\SEMISTER2\\newfile\\newfile.txt");

       try {
            //creating scanner object
            Scanner readScanner=new Scanner(file);
            String firstName=readScanner.next();
            String lastName=readScanner.next();
            int age=readScanner.nextInt();

            System.out.println("person "+firstName+" "+lastName+" have age = "+age);
            System.out.println(readScanner.nextLine()); // read the firstline
            System.out.println(readScanner.nextLine()); // read the second line
            System.out.println(readScanner.next());     //read the next word
            System.out.println("does file have more data to read : "+readScanner.hasNext());  // check whether the Scanner have more data to read or not
            
            if (readScanner.hasNext()==false){
                readScanner.close();
            }
       } 
        catch (Exception e) {
            System.out.println("some problem in reading the file");
       }

    }
    
}
