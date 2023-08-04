
import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        //creating the instance of vector
        Vector<Integer> vector=new Vector<>();

        //Adding objects in the vector
        vector.addElement(5);
        vector.addElement(55);
        vector.addElement(45);
        vector.addElement(25);
        vector.addElement(56);
        vector.addElement(59);

        
        System.out.println("vector : "+vector);


        //finding the capacity of the vector
        System.out.println("capacity of the vector : "+vector.capacity());



        //copies the element of the vector to the array
        Integer[] arr={1,5,6,3,8,4};

        vector.copyInto(arr);
        for (Integer integer : arr) {
            System.out.println(integer);
        }

        System.out.println(vector);




        //get element
        System.out.println(vector.elementAt(5));


        //increasing the capacity of the vector
        vector.ensureCapacity(50);


        //getting the first element
        System.out.println(vector.getFirst());


        //inserting the new element in the vector
        vector.insertElementAt(500, 2);
        System.out.println(vector);

        //getting the last element
        System.out.println(vector.lastElement());


        //removing all elements
       // vector.removeAll(vector);
        System.out.println(vector);

        //remove element at index 
        vector.remove(0);
        System.out.println(vector);


        //setting a new element at the specified index
        vector.setElementAt(5622, 0);
        System.out.println(vector);

        //capacity without triming
        System.out.println("capacity without trimming : "+vector.capacity());
        //triming the capacity of the vector
        vector.trimToSize();
        //capacity with trimmed off
        System.out.println("capacity with trimming : "+vector.capacity());

    }

    
}
