
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //creating the instance of the Map
        HashMap<Integer,String> hashMap=new HashMap<>();

        for (int key = 0; key < 5; key++) {
            System.out.print("enter at the key "+key+" : ");
            String in=input.next();
            //input for Map
            hashMap.put(key, in);                        
        }
        

        System.out.println(hashMap);
    }
    
}
