import java.util.Scanner;


public class QuotientException {

    public static int quotient(int a, int b){
        if (b==0){
            // throwing an exception if b is zero
            throw new ArithmeticException("b can not be zero");   
        }
        return a/b;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter two integer no. ");
        //input from user
        int a=input.nextInt();
        int b=input.nextInt();

        //try block
        try{
            int result =quotient(a, b);
            System.out.println("a"+"/"+"b"+" is "+ result);

        }
        //catch block
        catch (ArithmeticException ex){
            System.out.println(ex);
        }

        System.out.println("But execution continue");
        
    }
    
}
