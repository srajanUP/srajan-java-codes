import java.lang.System;
public class arrayccopy_method {
    public static void main(String[] args) {
        int source_array[]={1,2,3,4,5,6,7,8,9,10};
        int target_array[]=new int[source_array.length];
        System.arraycopy(source_array,0,target_array,0,source_array.length);

        System.out.print("target array = ");
        System.out.print("[");
        for (int i=0;i<source_array.length;i++){
            System.out.print(target_array[i]);
            if (i!=source_array.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");


    }
    
}
