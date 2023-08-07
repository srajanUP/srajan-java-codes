package GUIInjava.JavaFx;


import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FirstJavaFx extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //creating button
        Button okButton=new Button("ok");
        //cerating button
        Scene scene=new Scene(okButton, 500,300);

        //setting the title and scene on the stage 
        stage.setTitle("my application");
        stage.setScene(scene);
        stage.setResizable(false);
        
        stage.show();


        
    }
    
    public static void main(String[] args) {
        launch(args);

        
    }

    
}
