
import java.util.*;
public class fibonacciSeriesUsingRecursion {
    //creating recursive method of the fibonacci series
    static int fibonacci(int indexrange){
        //base case
        if (indexrange==0){
            return 0;
        }
        //base case
        else if(indexrange==1){
            return 1;
        }
        else{
        //recursive case
            return fibonacci(indexrange-1)+fibonacci(indexrange-2);
        }
    }

    //main method    
    public static void main(String[] args) {
        try (//getting input from user
            Scanner input=new Scanner(System.in)) {
            System.out.print("enter the range of the series to be print : ");
            int indexranges=input.nextInt();
            //using the for loop to print the fibonacci series
            for(int i=0; i<indexranges;i++){
                System.out.print(fibonacci(i)+" ");
            }
        } catch (Exception e) {
            System.out.println("enter the valid input ");
        }
        
    }
}
