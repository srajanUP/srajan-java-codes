
// import java.util.*;

// import javax.sound.sampled.SourceDataLine;



// public class ExceptionHandling {
    
    //handling the exception in java using try and catch 

    // public static void main(String[] args) {
    //     Scanner input=new Scanner(System.in);
    //     // using the try and catch to deal with exception
    //     try{
    //         int a,b,c;
    //         System.out.print("enter the value of numerator a :");
    //         a=input.nextInt();
    //         System.out.print("enter the value of denominator b :");
    //         b=input.nextInt();

    //         System.out.println("the a\b is "+a/b);
    //     }
    //     // catch block for dealing with input mismatch 
    //     catch (InputMismatchException ie){
    //         System.out.println("not valid input ");
    //     }
    //     // catch block to deal with all renmaining type of exception
    //     catch (Exception e){
    //         System.out.println(" can not divide byt zero");
    //     }
    //     System.out.println("bye bye program finished");
    // }



 // ****************************************************************************************************************************************** 
    






     //throwing an exception using throw keyword 
    //main method
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.println("enter a:");
//         int a=input.nextInt();
//         System.out.println("enter a:");
//         int b=input.nextInt();
//         // try and catch bokcks
//         try{
//             System.out.println("the value of a/b is : "+divide(a,b));
//         }
//         catch(Exception e){
//             // printting the exception discription
//             System.out.println(e);
//         }
        
//     }

//     //custom method
//      static int divide(int a, int b){
//         if (b==0){
//             // throwing an exaception if the condition is true 
//             ArithmeticException e=new ArithmeticException();
//             throw e;
//         }
//         // returning the division of a and b
//         return a/b;

//     }





//*******************************************************************************************************************************************

 
    





    // chaining of the exception in multiple methods
    //main method
    // public static void main(String[] args) {
    //     Scanner input=new Scanner(System.in);
    //     System.out.print("enter a:");
    //     int a=input.nextInt();
    //     System.out.print("enter a:");
    //     int b=input.nextInt();
    //     // try and catch bokcks
    //     try{
    //         // calling the divCall method
    //         System.out.println("The value of a/b is : "+divCall(a,b));
    //     }
    //     catch(Exception e){
    //         // printting the exception  in diffrent forms
    //         System.out.println(" tostring() method");
    //         System.out.println(e.toString());  // tostring method
    //         System.out.println("\n");
    //         System.out.println(" getmessage() method");
    //         System.out.println(e.getMessage());    // getmessage method
    //         System.out.println("\n");
    //         System.out.println(" printstackTrace() method");
    //         e.printStackTrace();                  // printstacktrace method
    //         System.out.println("\n");
    //         System.out.println(" getStackTrace() method");
    //         System.out.println(e.getStackTrace());  // getstacktrace method
            
    //     }
    //     //finally block
    //     finally{
    //         System.out.println("This is finally block which always execute whether the exception is there or not ");
    //     }
        
    // }


    // // custom method 1
    // static int  divCall(int a,int b){
    //          return divide(a,b);

    //         // try{
    //         //     // calling the divide function
    //         //     divide(a,b);
    //         // }
    //         // catch (Exception e){
    //         //     System.out.println(" divCall exception "+e);
    //         // }
    // } 




    // //custom method 2
    // static int divide(int a, int b){
    //     if (b==0){
    //         // throwing an exaception if the condition is true 
    //         ArithmeticException e=new ArithmeticException();
    //         System.out.println(e);
    //         throw e;
            
    //     }
    //     // returning the division of a and b
    //     return a/b;

    // }



    
    //***************************************************************************************************************************************
    





// creating user or custom exceptions
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.print("enter a: ");
//         int a=input.nextInt();
//         System.out.print("enter b: ");
//         int b=input.nextInt();
        
//         try{
//             if(b<0){
//                 // throwing an exception
//                 throw new NotNegativeException(b);
//             }
//             System.out.println(" a/b = "+a/b);
//         }
//         // catching an exception
//         catch(NotNegativeException non){
//             System.out.println(non.getMessage());

//         }
//     }



// }


// class NotNegativeException extends Exception{     // the custom class is not extended to runtime exception because 
//     int b;                                          // this will made our exception unchecked.
//     public NotNegativeException(int b){
//         //calling the constructor of Exception class 
//         super("value "+b+" can not be negative ");
//         // providing the value of b(object value) to the parameter b 
//         this.b=b;                                              
//     }
// }
