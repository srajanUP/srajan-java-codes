public class copying_array {
    public static void main(String[] args) {
        int source_array[]={1,2,3,4,5,6,7,8,9,10};
        int target_array[]=new int[source_array.length];

        for (int i=0;i<=source_array.length-1;i++){
            target_array[i]=source_array[i];
        }
        
        System.out.print("target array = ");
        System.out.print("[");
        for (int i=0;i<source_array.length;i++){                        // copying target array
            System.out.print(target_array[i]);
            if (i!=source_array.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");

        System.out.println(" ");


        System.out.print("source_array = ");
        System.out.print("[");
        for (int i=0;i<source_array.length;i++){                            // displaying target and source array
            System.out.print(source_array[i]);
            if (i!=source_array.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        
    }
    
}
