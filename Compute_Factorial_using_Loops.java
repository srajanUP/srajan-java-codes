package DSAandAlgorithmINJava;
import java.util.*;

public class ComputeFactorialUsingLoops {
    public static void main(String[] args) {
        //using try with resource to autoclose the Scanner object
        try ( Scanner input=new Scanner(System.in);)
        {   
            //taking input from the user
            int n=input.nextInt();
            //initialising the value of factorial
            int factorial=1;
            //declaring the for loop to calculate the factorial
            for(int i=1;i<=n;i++){
                factorial=i*factorial;
            }
            //printing the factorial
            System.out.println(factorial);
            
        }
         catch (InputMismatchException e) {
            System.out.println("please enter the valid integer input");
        }    
    }
    
}
