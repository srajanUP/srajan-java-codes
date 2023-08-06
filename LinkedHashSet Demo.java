
import java.util.LinkedHashSet;
public class LinkedhashSet {
    public static void main(String[] args) {
        //cretaing the object of the linkedhashset
        LinkedHashSet<String> lhs=new LinkedHashSet<>();

        //adding objects/elements
        lhs.add("agra");
        lhs.add("delhi");
        lhs.add("ludhiyana");
        lhs.add("lucknow");
        lhs.add("patna");        //duplicate are not allowed
        lhs.add("patna");

        //printing the linkedHashSet
        System.out.println(lhs);


        //printing the elements using the foreach loop
        for (String string : lhs) {
            System.out.println(string);            
        }


        


        
    }
    
}
