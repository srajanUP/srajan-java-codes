import java.util.ArrayList; 

public class TestCollection {
    public static void main(String[] args) {
        //creating instanse of the arraylist
        ArrayList<String> arrayList=new ArrayList<>();
        

        //adding elements
        arrayList.add("srajan");
        arrayList.add("aakash");
        arrayList.add("shivanshu");
        arrayList.add("kanshisk");
        arrayList.add("aman");


        //getting the collection
        System.out.print("names : ");
        System.out.println(arrayList);
        

        //contains method to check the existace of the element in the array
        System.out.println("does the array contains aakash : "+arrayList.contains("aakash"));


        //removing the names from the array
        arrayList.remove("aman");

        //getting the size 
        System.out.println("size of an array is : "+arrayList.size());


        //creating another arraylist object using cloning
        ArrayList<String> arrayList2=(ArrayList<String>)(arrayList.clone());
        

        System.out.println("arraylist2 ");
        System.out.println(arrayList2);

        // adding the collection arraylist to the collection Arraylist2
        arrayList.addAll(arrayList2);

        System.out.println(arrayList);

         //removing the elements of the collection arraylist2 from collection arraylist
         
         arrayList.removeAll(arrayList2);

         //printing the collection arraylist after removing the collection arraylist2

         System.out.println(arrayList2);




    }
    
}
