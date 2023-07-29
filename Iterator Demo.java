import java.util.ArrayList;
import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        try(Scanner input =new Scanner(System.in)) {

            //creating ArrayList Object
            ArrayList<Integer> arl=new ArrayList<>();
            

            System.out.print("enter the range : ");
            int n=input.nextInt();
            

            //adding elements to an array
            for (int i = 0; i <n; i++) {
                System.out.print("enter the val : ");
                int val=input.nextInt();
                
                arl.add(val);
            }


            //displaying the arl
            System.out.println("arl = "+arl);


            //uisng iterator to show the list

            Iterator<Integer> it=arl.iterator();
            while (it.hasNext()){                      //uisng hasnext() to check if there is next element or not
                System.out.println(it.next());         //using next method to get element
            }
        }


    }    
}
