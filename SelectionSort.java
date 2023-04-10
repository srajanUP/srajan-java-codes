public class selection_sort {
    public static void SelectionSort(int[] arr) {
        for(int i=0 ; i<=arr.length-1;i++){
            for(int j=i+1; j<=arr.length-1;j++){
                int temp=0;
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        System.out.println(java.util.Arrays.toString(arr));
        
    }


    public static void main(String[] args) {
        int[] arr={1,6,7,3,4,9,2,5};
        SelectionSort(arr);
    }
    
}
