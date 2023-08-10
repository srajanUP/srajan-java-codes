
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        //creating the instance of the treemap
        TreeMap<String,Integer> treeMap=new TreeMap<>();


        treeMap.put("srajan", 1234560);
        treeMap.put("aman", 1234561);
        treeMap.put("shivanshu", 1234569);
        treeMap.put("anand", 12345605);
        treeMap.put("krishna", 1234567);


        //objects are arranged in ascending order of the keys by default
        System.out.println(treeMap);

        

        //printing the key and value pair using lambda expression
        treeMap.forEach((k,v) -> System.out.printf("%-10S %d\n",k,v));


    }
    
}
