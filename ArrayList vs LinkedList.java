import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestArrayAndLinkedLIst {
    public static void main(String[] args) {


        //reating array list
        ArrayList<Integer> arrayList =new ArrayList(); 
        
        //adding elements in the array list
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(6);

        System.out.println(arrayList);

        //adding elements in the array at specified index
        arrayList.add(0,1);
        System.out.println(arrayList);
        arrayList.add(5,10);
        System.out.println(arrayList);
        arrayList.add(6,7);

        System.out.println(arrayList);

        

        //creating LinkedLists
        
        LinkedList<Object> linkedList=new LinkedList<Object>(arrayList);
        

        //adding element sin the linked list at specified index
        linkedList.add(1,"srajan");
        //adds the element at the last
        linkedList.add("aakash");

        System.out.println("linked list : "+linkedList);
        
        
        //removing element from the data structure
        linkedList.remove();    //removes the element from the first
        System.out.println("linked list : "+linkedList);
        linkedList.removeFirst();    //removes the element from the first
        System.out.println("linked list : "+linkedList);
        linkedList.removeLast();    //removes the element from the Last
        System.out.println("linked list : "+linkedList);



        //using list Iterator for displaying the list
        ListIterator<Object> listIterator= linkedList.listIterator();
        
        //next method prints in forward direction
        while(listIterator.hasNext()){
            System.out.print(listIterator.next()+",");
        }
        

        //previous method prints in the backward direction
        System.out.println();
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+",");
        }




        //calculating the efficiency of the linked lists and Arraylist

        ArrayList<Integer> arrayList1=new ArrayList<>();
        
        LinkedList<Integer> linkedList2=new LinkedList<>();
        

        //calculating time for arraylist
        long timeAlSt=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0,i);
            
        }
        long timeAl=System.currentTimeMillis()-timeAlSt;
        
        
        //
        long timeLlSt=System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            linkedList2.add(0,i);
            
        }
        long timeLl=System.currentTimeMillis()-timeLlSt;


        //displaying the time taken 
        System.out.println();
        System.out.println("time taken by the arraylist for insertion at the begening : "+timeAl+" millisecond");
        System.out.println("time taken by the LinkedList for insertion at the begening : "+timeLl+" millisecond");

        
    }
    
}
