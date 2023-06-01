import java.util.*;
public class ArrayList {
        public static void main(String[] args) {
        java.util.ArrayList<Integer> list =new java.util.ArrayList();
        for (int i=0;i<10;i++){
            //using add function to add the integer number in the Array list
            list.add(i);                   

        }

        //replacing the integer with new integer using set method
        list.set(2,4);

        for (int i=0;i<10;i++){
            //using the get method to get the integer at specified index
            System.out.print(list.get(i)+" ");


        }
        System.out.println(list.size());

        

        //getting the size of the ArrayList using size method
        System.out.println(list.size());

        //remove method to remove the element at specified index or element
        list.remove(2);
        

        //using clear method to remove all the elements from the list
        list.clear();



        
    }


    
}
