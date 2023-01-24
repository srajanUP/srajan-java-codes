import java.util.Scanner;


public class srajan1 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        // creating of an array

        int mylist[] =new int[5];
        System.out.print("enter the elements of an array = ");
        

        //input of an array 


        for (int i=0;i<=4;i++){
            int x=input.nextInt();
            mylist[i]=x;
        }


        // shifting of elements 


        int count=mylist[4];
        for (int i=4; i>=1;--i){
            mylist[i]=mylist[i-1];
            
                
        }
        mylist[0]=count;
        
        // printing of shifted array
        
        System.out.print("Shifted arary = ");
        System.out.print("[");
        for (int i=0; i<=mylist.length-1;i++){
            System.out.print(mylist[i]);
            if (i!=mylist.length-1){
                System.out.print(" , ");
            }
        }
        System.out.println("]");
    }
    
}
