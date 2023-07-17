import java.util.*;
public class BinarySerachUsingRecursion {
    //recursive method
    public static int binarySearch(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
         return binarySearch(arr, key, low, high);
                   
    }

    //recuesive helper method
    public static int binarySearch(int[]arr,int key,int low,int high){
        if (high<low){
            return -1;
        }

        int mid=(low+high)/2;
        
        if (key<arr[mid]){
            return binarySearch(arr, key, low, mid-1);
        }
        
        else if (key==arr[mid]){
            //base case
            return mid;
        }
        else{
            return binarySearch(arr, key,mid+1, high);
        }

    }
    public static void main(String[] args) throws InputMismatchException {
        
        try (Scanner input=new Scanner(System.in)) {
            int[] arr={1,2,3,4,5,6,7,8,9};
            System.out.println("enter the element to find in an array : ");
            int key=input.nextInt();
            System.out.println(binarySearch(arr, key));

        } catch (InputMismatchException e) {
            System.out.println("enter the correct integer input");
        }
        
    }
    
}
