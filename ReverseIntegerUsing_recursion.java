import java.util.InputMismatchException;
import java.util.Scanner;

public class ReversingIntegerUsingRecursion {

    //main method
    public static void main(String[] args) throws InputMismatchException{
        try (Scanner input=new Scanner(System.in);){
            System.out.print("enter the value : ");
            int value =input.nextInt();
            reverseInt(value);
            
        } 
        catch (InputMismatchException e) {
            System.out.println("please enter valid input ");
        }
        
    }

    //reverse method
    public static void reverseInt(int n) {
        if (n > 0) {
            System.out.print(n % 10);     // 1234567 % 10 = 7
            reverseInt(n / 10);           // 1234567 / 10 =  123456
        }
    }
    
}
