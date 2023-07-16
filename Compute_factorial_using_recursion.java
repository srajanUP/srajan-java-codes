package DSAandAlgorithmINJava;
import java.util.*;


public class ComputeFactorial {
    //defining the factoril method
    static int factorial(int n){
        //base case
        if (n==0){
            return 1;
        }
        //recursive case
        else if (n>0){
            return n*factorial(n-1);
        }
        else{
            return -1;
        }

    }
    
    
    //main method
    public static void main(String[] args) {
        //using try with resources to autoclose the Scanner object
        try( Scanner input=new Scanner(System.in);) {
            
            //getting input from the user
            System.out.print("Enter the integar number to find the fcatorial : ");
            int n=input.nextInt();
            
            //calling the factorial method 
            if (factorial(n)==-1){
                System.out.println("please enter positive integar");
            }
            else{
                System.out.println("factorial of "+n+" is "+factorial(n));
            }


            
        }
        // handling the input mismatch exception 
        catch (InputMismatchException e) {
            System.out.println("please enter integer value.");
            System.out.println("SORRY! factorial is not define for input you have provided.");
        }
        
    }


    
}
