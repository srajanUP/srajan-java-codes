import java.util.ArrayList;
import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        try(Scanner input =new Scanner(System.in)) {

            //creating ArrayList Object
            ArrayList<Integer> arl=new ArrayList<>();
            

            System.out.print("enter the range : ");
            var n=input.nextInt();
            

            //adding elements to an array
            for (int i = 0; i <n; i++) {
                System.out.print("enter the val : ");
                int val=input.nextInt();
                
                arl.add(val);
            }


            //displaying the arl
            System.out.println("arl = "+arl);


            //uisng iterator to show the list
            System.out.println("printing values using iterator");
            Iterator<Integer> it=arl.iterator();
            while (it.hasNext()){                      //uisng hasnext() to check if there is next element or not
                System.out.println(it.next());         //using next method to get element
            }

            //using the for each loop for iterating
            System.out.println("printing values using for each loop ");
            for (Integer integer : arl) {
                System.out.println(integer);
            }

            //using the forEach() method of the iterable interface
            System.out.println("printing elements using forEach method");
            arl.forEach(s-> System.out.println(s)); 
        }


    }    
}
