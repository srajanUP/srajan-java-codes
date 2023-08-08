
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //creating the instance of the Map
        Map<Integer,String> hashMap=new HashMap<>();

        for (int key = 0; key < 5; key++) {
            System.out.print("enter at the key "+key+" : ");
            String in=input.next();
            //input for HashMap
            hashMap.put(key, in);                        
        }


        //getting the size of the hashmap
        System.out.println(hashMap.size());
        System.out.println("hashmap : "+hashMap);


        //getting the Set of keys
        System.out.println(hashMap.keySet());


        //removing the value from the map using the key
        hashMap.remove(2);
        System.out.println(hashMap);

        //checking if the map is empty or not
        System.out.println("is map is empty : "+hashMap.isEmpty());


        //checking whether the map contains the value or not
        System.out.println("does the map contains the aman : "+hashMap.containsValue("aman"));


        //clearing the hashmap
        hashMap.clear();
        System.out.println(hashMap);


        System.out.println(hashMap.values());
    }
    
}
