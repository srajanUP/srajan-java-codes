


import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        //creating the instanse of hash set
        Set<Integer> hashset=new HashSet<>();
        //adding elements
        hashset.add(5);
        hashset.add(54);
        hashset.add(15);
        hashset.add(15);
        hashset.add(55);   //duplicate values will not shown in the set.
        hashset.add(95);
        hashset.add(95);

        System.out.println("hashset : "+hashset);



        //using the for each loop for accessing elements in the set
        for (Integer integer : hashset) {
            System.out.print(" "+integer);
            
        }
        System.out.println();

        //using lambda expression for accessing the elements in the set
        hashset.forEach(e-> System.out.print(" "+e));
    }
    
}
