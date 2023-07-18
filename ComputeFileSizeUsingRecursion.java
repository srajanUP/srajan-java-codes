import java.io.File;

public class ComputeDirectorySizeinjava {
    //recursive function
    public static long computeFileSize(File file){
        //store the size of all files
        long size=0; 


        //recursive case if the directory is encounterd
        if (file.isDirectory()){
          //creating array of files and directory
            File[] filesarr= file.listFiles();
            for(int i=0;filesarr!=null && i<filesarr.length;i++){
                //recursive call to the method of the non empty directory is found
                size+=computeFileSize(filesarr[i]);
            }
        }


        else if(file.isFile()) {
            //base case
           size+=file.length();
        }


        //rerturning the size
        return size;
    }


    public static void main(String[] args) {
        try{
            File file=new File("D:\\PROGRAMING_CODES\\DemoDirectory");
            System.out.println("size of the directory is : "+computeFileSize(file)+" bytes.");

        } catch (Exception e) {
            System.out.println("invalid path");
        }
        
    }
    
}
