import java.util.*;

public class plaindrome {

    public static int reverse(int number){
        int x1 = number%10;
        int y1 = number/10;
        int x2 = y1%10;
        int x3 = y1/10;

        int rev= (100*x1+10*x2+x3);

        return rev;


        
    }


    public static boolean isPalindrome(int number){
        int y=reverse(number);
        if (y==number){
            return true;

        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter the no. to check the palindrome = ");
        int y=input.nextInt();
        if (isPalindrome(y)){
            System.out.println("yes! the number you have entered is palindrome");
        }
        else{
            System.out.println("no! the number is not palindrome");

        
        }
    }
    
}
