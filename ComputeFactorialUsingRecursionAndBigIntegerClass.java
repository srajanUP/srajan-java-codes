package DSAandAlgorithmInJava.Recursion;
import java.math.BigInteger;
import java.util.Scanner;

public class QuestionOnRecursion {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            //getting input from the user
            String sc=input.nextLine();
            //creating Biginteger class object
            BigInteger fact=new BigInteger(sc);
            System.out.println(factorial(fact));
        }
    }
    
    //recursive method to get the factorial of large numbers
    static BigInteger factorial(BigInteger fact){
        //intialising the value of Zero using BigInteger class
        BigInteger zero=BigInteger.ZERO;
        
        //base case 
        if (fact==zero){
            return BigInteger.ONE;
        }
        //rec1ursive case
        else {
            //substraction in Biginteger class
            BigInteger sub=fact.subtract(BigInteger.ONE);
            //recursive call
            return fact.multiply(factorial(sub));
        }
    }
    
}
