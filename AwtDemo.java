package GUIInjava.Awt;


import java.awt.*;

public class Awt {
    public static void main(String[] args) {

        //creating the frame 
        Frame frame=new Frame("my app");
        frame.setLayout(new FlowLayout());
        
        //creating button
        Button b=new Button("ok");
        b.setSize(50, 50);

        frame.add(b);
        

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    
}
