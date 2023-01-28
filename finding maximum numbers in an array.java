import java.util.Scanner;


public class srajan1 {
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int mylist[]=new int[5];
            for (int i=0; i<=4;i++){
                System.out.print("enter the "+(i+1)+" number = ");
                int x=input.nextInt();
                mylist[i]=x;
            }
            int m=0;
            int max=mylist[0];
            for (int i=0;i<4;i++){
                if (max < mylist[i]){
                    max = mylist[i];
                }
                else 
                max=mylist[m];
                m+=1;
            }
            System.out.println("maximum value is "+ max);
        }
        
    }
    


}
