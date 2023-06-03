public class TryAndCatch {
    public static void main(String[] args) {
      // try block
        try {
            int array[]={10,0,3,4};
            System.out.println(array[3]);
            System.out.println((float)array[0]/array[1]);
          
         }
        // catch blocks
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please enter the index less than 4");
         }
        catch (ArithmeticException b){
            System.out.println("denominator can not be zero ");
         }
         //for exit the code (terminate the progarm)
         System.exit(1); 
         System.out.println("ok thankyou");
         
    }
    
}
