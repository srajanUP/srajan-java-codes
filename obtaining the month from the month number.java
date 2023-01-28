import java.util.Scanner;


public class srajan1 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        // creating of an array
        String mylist[] =new String[12];
        
        for (int i=0;i<12;i++){
            System.out.print("enter the the "+(i+1)+" month = ");
            String year=input.next();
            if (i<12){
                mylist[i]=year;
            }
            
        }
        System.out.println(" ");
    
        
        // printing of shifted array
        
        System.out.print("years = ");
        System.out.print("[");
        for (int i=0; i<=mylist.length-1;i++){
            System.out.print(mylist[i]);
            if (i!=mylist.length-1){
                System.out.print(" , ");
            }
        }
        System.out.println("]");
        System.out.println();


        
        System.out.print("enter the month to be print = ");

        int index=input.nextInt();

        System.out.println();
        System.out.println(index +"^th  month of the year is   " +"\""+mylist[index-1]+"\"" );


    }
    
}
