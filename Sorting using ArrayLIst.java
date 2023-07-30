import java.io.File;
import java.util.ArrayList;

public class Test{
   public static void main(String[] args) {
      ArrayList<Integer> arl=new ArrayList<>();

      arl.add(5);
      arl.add(6);
      arl.add(9);
      arl.add(10);
      arl.add(1);
      arl.add(2);
      System.out.println("arraylist before sorting : "); 
      System.out.println(arl);
      

      System.out.println("arraylist after sorting");

      arl.sort(null);
      System.out.println(arl);
   }
}
