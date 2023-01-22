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


        //display of an old array

        System.out.println("old array = ");
        System.out.print("[");  
        for (int i=0; i<=4;i++){
            System.out.print(mylist[i]);
            if (i!=4){
                System.out.print(", ");
            }

        }
        System.out.println("]");
        System.out.println();

            
        
        // /generating random no. for swaping and random shuffling
        
        for (int i=0; i<=4;i++){
            int y=(int)(0+Math.random()*5);
            int count =mylist[i];

            mylist[i]=mylist[y];
            mylist[y]=count;
            

        }


        // display of new array after random shuffling
        System.out.print("new array = ");
        System.out.print("[");  
        for (int i=0; i<=4;i++){
            System.out.print(mylist[i]);
            if (i!=4){
                System.out.print(", ");
            }

        }
        System.out.print("]");
        System.out.println();
    }
    
}
