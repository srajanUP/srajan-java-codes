public class binarySearch {
    public static int BinarySearch(int[] arr, int key) {
        
        int low = 0;
        int high = arr.length-1;
        
        
        while (high>=low){
            int mid = (low+high)/2;
            
            if(key == arr[mid]){
                return mid;
                
            }
            
            else if (key<arr[mid]){
                high= mid-1;
            }

            else if (key>arr[mid]){               
                low=mid+1;
            }
    
        }
    
        return -1;

    }

    
    public static void main(String[] args) {
        
        int key=3;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("the index of key "+key+" is "+BinarySearch(arr,key));


    }

    
    
}
