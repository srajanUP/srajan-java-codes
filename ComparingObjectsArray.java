import java.math.BigInteger;
import java.util.*;
public class SortingComparableObjects {
    public static void main(String[] args) {
        String[] cities={"agra","jalandhar","patna","amritsar","ludhiyana"};
        java.util.Arrays.sort(cities);
        
        System.out.print ("cities are : ");
        for(String city : cities) {
            System.out.print(city+" ");
            if (city!="patna"){
                System.out.print(", ");
            }
        }

        System.out.println();
        //comparing the objects 
        BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"),
        new BigInteger("432232323239292"),
        new BigInteger("54623239292")};
        java.util.Arrays.sort(hugeNumbers);
        
        for (BigInteger number: hugeNumbers)
            System.out.print(number + " ");
    }
    
}
