import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class CountingKeyword {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("D:\\PROGRAMING_CODES\\sourcefile.dat");
        if (file.exists()){
            System.out.println("the number of keywords in the file are : "+keywordCount(file));
        }
        else{
            System.out.println("no such file exists");
        }
        
    }


    public static int keywordCount(File file) throws FileNotFoundException{
        int count=0;

        String[] keywordString = {"abstract", "assert", "boolean",
        "break", "byte", "case", "catch", "char", "class", "const",
        "continue", "default", "do", "double", "else", "enum",
        "extends", "for", "final", "finally", "float", "goto",
        "if", "implements", "import", "instanceof", "int",
        "interface", "long", "native", "new", "package", "private",
        "protected", "public", "return", "short", "static",
        "strictfp", "super", "switch", "synchronized", "this",
        "throw", "throws", "transient", "try", "void", "volatile",
        "while", "true", "false", "null"};


        //creating the set for the data
        HashSet<String> hs=new HashSet<>(Arrays.asList(keywordString));

        Scanner input=new Scanner(file);


        while(input.hasNext()){
            String word=input.next();
            if(hs.contains(word)){
                count++;
            }
            
        }

        return count;


    }
    
}
