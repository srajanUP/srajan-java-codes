import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleGUIExample  {
    public static void main(String[] args) {
        try(Scanner input=new Scanner(System.in);){



        // Create a JFrame (window) and set its properties
        JFrame frame = new JFrame("Srajan grades");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        

        //getting input from user
        System.out.println("Enter the content to be shown on the frame : ");
        String var=input.nextLine();

        

        // Create a JLabel (text label) and add it to the frame
        JLabel label= new JLabel(var);
        frame.getContentPane().add(label);
        
        
        // Display the frame
        frame.setVisible(true);

        }
        catch(InputMismatchException e){
            System.out.println(" enter valid string");

        }
    }
    
}
