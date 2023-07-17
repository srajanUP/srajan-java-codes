
import java.util.Scanner;
public class RecursiveSelectionSort {
    //recursive method
    public static void  recursiveSelSort(int[] arr){
        recursiveSelSort(arr, 0, arr.length-1);

    }
    
    //recursive helper method
    public static void recursiveSelSort(int[] arr,int low,int high){
        //base case
        if (low <high){
            //find the smallest element and it's index in arr[low...high]
            int indexOfMin=low;
            int min=arr[low];
            for(int i=low+1;i<=high;i++){
                if (arr[i]<min){
                    min=arr[i];
                    indexOfMin=i;
                }
            }
            //swaping the smallest element
            arr[indexOfMin]=arr[low];
            arr[low]=min;
            System.out.println(min);

            //sort the remaining arr
            recursiveSelSort(arr, low+1, high);
        } 
        else {
            System.out.println(arr[high]);
        }

    }


    //main method
    public static void main(String[] args) {
        try(Scanner input=new Scanner(System.in)) {
            //getting the range input from the user
            System.out.print("enter the range of the array :");
            int range=input.nextInt();



            //creating an array
            int[] arr=new int[range];
            for(int i=0;i<range;i++){
                System.out.print("enter the "+(i+1)+" element : ");
                int val=input.nextInt();
                arr[i]=val;
            }

            //dispalying an array
            System.out.print("array = ");
            System.out.print("[");
            for (int i=0;i<arr.length;i++) {
                System.out.print(arr[i]);
                if(i!=arr.length-1){
                    System.out.print(",");
                }               
            }
            System.out.print("]\n");


            
            //calling the the recursiveSelectionSortMethod
            recursiveSelSort(arr);




            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
