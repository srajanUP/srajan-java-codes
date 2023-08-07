
import java.util.*;
public class TreeSetDemo {
    public static void main(String[] args){
        TreeSet<String> ts=new TreeSet<>();
        ts.add("srajan");
        ts.add("Aman");
        ts.add("aakash");
        ts.add("shivanshu");
        ts.add("kanshisk");
        ts.add("divyanshu");
        ts.add("karan");
        ts.add("karan");
        ts.add("anjali");
        
        System.out.println(ts);
        
        
        //first() and last() method
        System.out.println("first element : "+ts.first());
        System.out.println("last element : "+ts.last());
        
        
        
        //headset(toelement)  and tailSet(fromelement)
        System.out.println("upto kanshisk : "+ts.headSet("kanshisk"));  //return the names before the name kanshisk
        
        System.out.println("from shivanshu : "+ts.tailSet("shivanshu"));  //return the names after teh shivanshu(included)
        
        
        
        System.out.println(ts.floor("divyanshu"));


        //deleting the element fro last and fom the first
        ts.pollFirst();
        ts.pollLast();

        System.out.println("after removing the first and the last element : "+ts);


        //finding the size of the set
        System.out.println("size : "+ts.size());



        
        
        //ceating integer treeset
        TreeSet<Integer> tsi=new TreeSet<>();
        tsi.add(45);
        tsi.add(69);
        tsi.add(2);
        tsi.add(78);
        tsi.add(23);

        System.out.println(tsi);

        System.out.println(tsi.lower(69)); //return <69
        System.out.println(tsi.floor(69));  //rteurn <=69
        System.out.println(tsi.ceiling(69));  //return >=69
        System.out.println(tsi.higher(69));   //return >69




    }
    
}
