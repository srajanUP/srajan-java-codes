import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        //creating thw instance of the queue
        ArrayDeque<Integer> dqueue=new ArrayDeque<Integer>();
        dqueue.offerLast(5);
        dqueue.offerLast(95);
        dqueue.offerLast(51);
        dqueue.offerLast(56);
        dqueue.offerLast(35);
        System.out.println(dqueue);
        

        //using the removefirst() method to remove the first element  
        dqueue.removeFirst();
        System.out.println(dqueue);



        dqueue.offerFirst(1);
        dqueue.offerFirst(16);
        dqueue.offerFirst(13);
        dqueue.offerFirst(18);
        dqueue.offerFirst(11);

        //using the poll method to delete the first element
        System.out.println(dqueue);
        System.out.println(dqueue.poll());

        //remove() method to delete the first element
        try {
            while(dqueue.size()!=-1){
                dqueue.remove();
            }
            System.out.println(dqueue);
        } catch (Exception e) {
            System.out.println("queue is empty");
        }

    }
    
}
