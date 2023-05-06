/** printing the fibonacci series
 * 0 1 1 2 3 5 8 13 21 ......
 
*/  

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        // getting the range from the user to print the series.

        Scanner input=new Scanner(System.in);
        System.out.println("enter the lenght upto which you want to print the series ");
        
        int LENGTH=input.nextInt();
        int i=0;
        int j=1;
        int y=0;

        // printing the first two terms of the series ie. 0 1 
        System.out.print(i+" "+j+" ");

        // assigning the value of  j to i and value of y to j


        for (int length=1; length<=LENGTH;length++){
            y=i+j;
            i=j;
            j=y;

            // printing the digits 
            System.out.print(y+" ");        
           
            }
        }
 }
