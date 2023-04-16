import java.util.*;

public class 2dArrayCreation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
        System.out.print("enter the row value = ");                  // getting row and column from user
        int row = input.nextInt();
        System.out.print("enter the column value = ");
        int column = input.nextInt();
        
        int[][] array=new int[row][column];                         // declaring 2d array

        for (int i=0; i<row; i++){                                 // assigning values to 2d array
            System.out.print("enter the elements of"+i+" row ");
            for(int j=0; i<column;j++){
                
                array[i][j]=input.nextInt();
                
            }
        }

        for (int i=0; i<row; i++){                                 // printing values to 2d array
            for(int j=0; i<column;j++){
                System.our.print(array[i][j]);

                
            }
            System.our.print();


            
        }



    }
    
}
