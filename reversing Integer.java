import java.util.*;

public class reverse_of_integer {

    public static void reverse(int number){
        String x=number+"";                   // converting number to string
        
        char[] arr=new char[x.length()];      // creating array of string

        
        for(int i=0; i<x.length();i++){       // assigning char values to array    
            arr[i]=x.charAt(i);
        }

        String count="";                      // creating empty string

        
        
        for (int i=0; i<x.length();i++){       // reversing  the string 
            count+=arr[(x.length()-1)-i];
        }


        int rev = Integer.parseInt(count);     // converting the string to integer

        System.out.println(count);
    }

    
    
    public static void main(String[] args) {                      // main method
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number to reverse = ");
        int y=input.nextInt();
        reverse(y);                                               // calling the reverse method
    }
    
}
