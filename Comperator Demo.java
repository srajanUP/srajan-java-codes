import java.util.Comparator;


//implementing the comperatir interface
public class ComperatorDemo implements Comparator<Integer> {

    
    //overriding the comapere method
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1==o2){
            return 0;
        }   
        else if (o1<o2){
            return -1;
        }
        return 1;
    }

    

    public static void main(String[] args) {
        //calling the non static method in the ststic maing method by creating instance
        ComperatorDemo cd=new ComperatorDemo();
        System.out.println(cd.compare(30, 40));
        
    }    
}
