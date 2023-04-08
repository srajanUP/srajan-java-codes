public class linearSearch {
    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return i;            
            }

        }return -1;
        
    }
    
    
    public static void main(String[] args) {
        int key=2;
        int[] arr={1,5,4,6,8,6,2,7,85};
        if(linearSearch(arr,key)==-1){
            System.out.println("sorry! not such number is found");

        }
        else{
            System.out.println("elemrnt "+key+" found at index = "+linearSearch(arr,key));
        }

        
    }
    
}
