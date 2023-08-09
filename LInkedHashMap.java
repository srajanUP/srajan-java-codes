import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LInkedHashMapDemo {
   public  static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //creating the instance of the Map
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>(6,0.75f,true);

        //adding the values to the hashmap
        linkedHashMap.put("srajan", 6);                        
        linkedHashMap.put("aman", 4);                        
        linkedHashMap.put("karan", 6);                        
        linkedHashMap.put("shivanshu", 1);                        
        linkedHashMap.put("saurav", 2);                        
        linkedHashMap.put("siddanth", 5);     
        
        

        System.out.println("does the map contains the  srajan : "+linkedHashMap.containsKey("srajan"));
        




        System.out.println(linkedHashMap);
        
   }
}
