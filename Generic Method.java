public class GenericMethod {

    public static void main(String[] args) {
        Integer[] array1={1,5,6,3,8,7,85,6};
    String[] array2={"srajan","aman","hello"};


    print(array2);
    System.out.println();
    print(array1);
    }


    //generic method
    public static <E extends Object> void print(E[] arr){
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");            
        }
    }


    
}
