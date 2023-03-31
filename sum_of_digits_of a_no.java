import java.util.*;

public class sum_integer {
    
    public static int  sumDigits(int n) {      // method for sum of digits
 
        int sum=0;
        int x1;
        int x2;
        
        int y=(int)n;                          // loop for extracting and the numbers 
        for (int i=1; i<=3; i++){
            if (y<=n){
                x1 = y%10;
                x2 = y/10;
                y=x2;
                sum += x1;
            }

        }
    return sum;                                // returning the sum


    }


    public static void main(String[] args) {         // main method
        System.out.print("enter the digits = "); 
        Scanner input=new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(sumDigits(number));        // method calling 
    } 
    
}
