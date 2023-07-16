import java.util.Scanner;
public class PrintingMesageUsingRecursion {
    static String mesage(String mes,int times){
        //base case
        if (times==1){
            return mes;
        }
        else{
            //recursive case
            return  mes+"\n"+mesage(mes, times-1); 
        }
    }
    public static void main(String[] args) {
        //getting the input of the message and no of times to print the message
       try( Scanner input=new Scanner(System.in);) {
        System.out.print("enter the message in String : ");
        String mes=input.nextLine();
        System.out.print("enter the no. of times you want to print the message : ");
        int times=input.nextInt();

        //printing the message
        System.out.println(mesage(mes, times));
        
       } catch (Exception e) {
         System.out.println("please enter the valid input.");
       }

        
    }
    
}
