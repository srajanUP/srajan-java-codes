import java.util.Scanner;

public class Twosum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter the size of an array = ");
        int size=input.nextInt();
        int[] arr=new int[size];

        // creating an array

        for (int i=0 ; i<size ; i++){
            System.out.print("enter the "+(i+1)+" element of an array = ");
            int y=input.nextInt();
            arr[i]=y;           
        }
        System.out.println( " ");
        
        // displaying an array
        
        System.out.print("array = ");
        System.out.print("[ ");
        for (int i=0; i<size ;i++){
            System.out.print(arr[i]);
            if (i<(size-1)){
                System.out.print(",");
            }

        }
        System.out.print("]");


        // entering target element

        System.out.println(" ");

        System.out.print("Enter the target element = ");
        int Target= input.nextInt();
        
        // calculating the index
    
        for (int i=0; i<size;i++){
            for (int j=0; j<(size-1); j++){
                if (j+1>i){
                    if (arr[i]+arr[j+1]==Target){
                        System.out.println("["+i+","+(j+1)+"]");
                    }
                }

            }
        
        }
        
        
    }
    
}
