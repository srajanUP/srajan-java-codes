import java.util.Scanner;
import java.util.function.BinaryOperator;

public class srajan1 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
                                                          
        int numbers[]=new int[10];
        for (int i=0; i<=numbers.length-1;i++){
            System.out.print("enter the "+(int)(i+1)+" element = ");
            int x=input.nextInt();
            numbers[i]=x;               
        }
        

        System.out.print("numbers = ");
        System.out.print("[");
        for (int i=0;i<=numbers.length-1;i++){
            System.out.print(numbers[i]+" ");
            if (i!=numbers.length-1){
                System.out.print(", ");
            }
            
        }
        System.out.print("]");

        System.out.println();


        int min=numbers[0];
        for (int i=0;i<numbers.length-1;i++){
            if (numbers[i]<min){
                min=numbers[i];
            }

        }

        System.out.println("the minimunm no of an array numbers is = "+min);
      }
    

}
