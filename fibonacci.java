import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the lenght upto which you want to print the series ");
        
        int LENGTH=input.nextInt();
        int i=0;
        int j=1;
        int y=0;
        System.out.print(i+" "+j+" ");
        for (int length=1; length<=LENGTH;length++){
            y=i+j;
            i=j;
            j=y;
            System.out.print(y+" ");        
           
            }
        }
 }
