package DSAandAlgorithmInJava.Recursion;
import java.util.Scanner;


public class TowerOfHanoiUSingRecursion {
    //recursive method
    static void moveDisks(int n, char fromTower, char Totower, char AuxTower){
        //base case
        if (n==1){
            System.out.println("move "+1+" from "+fromTower+" to "+Totower);
        }
        //recursive case
        else{
            moveDisks(n-1, fromTower, AuxTower, Totower);
            System.out.println("move "+n+" from "+fromTower+" to "+Totower);
            moveDisks(n-1,AuxTower, Totower,Totower);
        }
    } 



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number of discs : ");
        int discs=input.nextInt();

        System.out.print("enter fromtower : ");
        char FromTower=input.next().charAt(0);
        
        System.out.print("enter totower : ");
        char ToTower=input.next().charAt(0);

        System.out.print("enter auxtower : ");
        char AuxTower=input.next().charAt(0);

        
        //calling the method 
        moveDisks(discs, FromTower, ToTower, AuxTower);

    }
    
}
