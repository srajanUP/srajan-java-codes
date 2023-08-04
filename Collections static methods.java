import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test{
   public static void main(String[] args) {

      //creating the array list
      ArrayList<Integer> arl=new ArrayList<>();

      arl.add(5);
      arl.add(6);
      arl.add(9);
      arl.add(10);
      arl.add(1);
      arl.add(2);
      System.out.print("arraylist before sorting : "); 
      System.out.println(arl);
      

      System.out.print("arraylist after sorting");
       
      //sorting the array
      arl.sort(null);
      System.out.println(arl);


      //sorting in the reverse order
      Collections.sort(arl, Collections.reverseOrder());
      System.out.println("sorting in  the reverse order :"+arl);


      try (Scanner input = new Scanner(System.in)) {
         System.out.print("enter the key : ");
         int key=input.nextInt();
         
         // using binary search to find the key in the array
         System.out.println(Collections.binarySearch(arl, key));
      }
      //reversing the list
      Collections.reverse(arl);
      System.out.println(arl);


      //shuffling the list

      Collections.shuffle(arl);
      System.out.println(arl);
      
      //shuffling the list
      Collections.shuffle(arl);
      System.out.println(arl);
      


      //finding the maximum object
      System.out.println("max : "+Collections.max(arl));

      //finding the min object
      System.out.println("min : "+Collections.min(arl));





      //creating another arraylist Collection
      ArrayList<Integer> arl2=new ArrayList<>();

      arl2.add(55);
      arl2.add(6);
      arl2.add(96);
      arl2.add(10);
      arl2.add(6);
      arl2.add(2);


      //checking if the two collection have same common element or not
      System.out.println("is there is no elment in common : "+Collections.disjoint(arl, arl2));
      


      //checking the the frequency of the the object
      System.out.println("no. of times the 6 occur in the arl2 :"+Collections.frequency(arl2,6));
   }
}
