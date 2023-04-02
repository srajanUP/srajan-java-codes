import java.util.*;

public class pattern {
    public static void displayPattern(int n){           // defining function
        
        // printing the pattern
        for (int j=0;j<=n;j++){
            for (int i=0;i<=n;i++){ 
                if (j+i>=n){
                    System.out.print(" ");               // spacing between the numbers
                    System.out.printf("%2d",n-i+1);      // formating the numbers
                    

                }
                else {
                    System.out.print("   ");             // adding spaces to the unfilles space
                }
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the range of the pattern = ");  // input mesage from user
        int y=input.nextInt();
        displayPattern(y);                                  // calling the function



    }
    
}
