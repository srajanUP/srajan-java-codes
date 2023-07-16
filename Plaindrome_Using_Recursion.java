import java.util.InputMismatchException;
import java.util.Scanner;
public class PlaindromesungRecursion {

    static boolean plaindrome(String str ){
        //base case
        //it returns true if  only last(middle) character is remainging
        if (str.length()==1){
            return true;      
        }
        
         //base case
         //if the end characters are not equal then it returns false 
        else if  (str.charAt(0)!=str.charAt(str.length()-1)){
            return false;    
        }
        else {
            //recursive case
            //it removes the end characters and creates substring to check whether it is palindrome or not.
            return plaindrome(str.substring(1, str.length()-1)); 
        }
    }
    public static void main(String[] args) throws InputMismatchException{
        try (Scanner input=new Scanner(System.in)){
            //getting the string input from the user
            String str=input.nextLine();
            //calling the method palindrome
            System.out.println(plaindrome(str));

            
        } catch (Exception e) {
            System.out.println("enter the valid input");
        }
        
    }
    
}
