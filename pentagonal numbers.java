public class methods1java {
    public static void getPentagonalNumber(int n) {
        
    int pno;
        for ( n=1;n<=100;n++){                      // to get the input from 1 to 100 
            pno=(n*(3*n-1))/2;
            System.out.printf("%-7d",pno);   // for printing the no. in the left jistify format and with 7 spaces
            if (n%10==0){
                System.out.println("\n");        // for printing 10 numbers only in one line at a time
            }
        }
        
        
        
    }
    

    public static void main(String[] args) {
        getPentagonalNumber(100);            //  calling the function getPentagonalNumber()
                                               /* providing the input of the 100 so that it can  print 100
                                                   pentagonal numbers*/  

    }
}
