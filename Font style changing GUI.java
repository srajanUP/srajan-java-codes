package GUIInjava.JavaFx;


import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.effect.Effect;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import java.util.concurrent.Flow;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.stage.Stage;




public class FirstJavaFx extends Application implements EventHandler<ActionEvent> {
    Text text;
    RadioButton r1,r2,r3,r4;
    CheckBox c1,c2,c3;
    ChoiceBox<Integer> choiceBox;
    int count=0;
    Button okButton;

    @Override
    public void start(Stage stage) throws Exception {

        //adding the text field
        text =new Text("Operating System");
        HBox hBox=new HBox();
        hBox.getChildren().add(text);
        hBox.setSpacing(15);
        hBox.setPadding(new Insets(10, 10,10,10));



        //creating the radio buttons
        r1=new RadioButton("red");
        r2=new RadioButton("blue");
        r3=new RadioButton("green");
        r4=new RadioButton("meganta");
        // so that only one button is cliked
        ToggleGroup tg=new ToggleGroup();
        r1.setToggleGroup(tg);
        r2.setToggleGroup(tg);
        r3.setToggleGroup(tg);
        r4.setToggleGroup(tg);
        //Creating HBOX for radio button
        HBox hBox1=new HBox();
        hBox1.getChildren().addAll(r1,r2,r3,r4);
        hBox1.setSpacing(15);
        hBox1.setPadding(new Insets(10,10, 10,10));


        //creating the check box
        c1=new CheckBox("BOLD");
        c2=new CheckBox("italic");
        c3=new CheckBox("normal");
        //cretaing hbox for the check box
        HBox hBox2=new HBox();
        hBox2.getChildren().addAll(c1,c2,c3);
        hBox2.setSpacing(15);
        hBox2.setPadding(new Insets(10, 10,10,10));


        //creating choice box
        choiceBox=new ChoiceBox<>();
        choiceBox.getItems().addAll(10,20,30,40,50);
        choiceBox.setPadding(new Insets(10,10,10,10));


        VBox vBox=new VBox();
        vBox.getChildren().addAll(hBox,hBox1,hBox2,choiceBox);
        vBox.setSpacing(15);
        vBox.setPadding(new Insets(10,10,10,10));



        //creating button
        Button okButton=new Button("_ok");
        okButton.setLayoutX(350);
        okButton.setLayoutY(425);
        okButton.setPrefSize(50,30);
        okButton.setOnAction(e->{count++;okButton.setText(""+count);});
        // okButton.setTextFill(Color.RED);
        okButton.setMnemonicParsing(true);
        
        //giving the tooltip while hovering the button
        Tooltip ToolTip=new Tooltip("press ok to save data");
        okButton.setTooltip(ToolTip);
        
        //setting the style of the button
        okButton.setStyle("-fx-border-color:yellow;-fx-background-color:lightblue");
        
        //handling the event
        // Alert alert=new Alert(AlertType.CONFIRMATION);
        // okButton.setOnAction(e->alert.show());
        
        
        //creating pane and adding the properties
        Pane pane=new Pane();
        pane.getChildren().add(okButton);
        pane.setRotate(0);
        pane.setStyle("-fx-border-color: black; -fx-background-color: white");
        
        
        //creating the pane for holding the circle
        Circle circle=new Circle();
        circle.setRadius(50); 
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        circle.setCenterX(350);
        circle.setCenterY(250);
        pane.getChildren().add(circle);
        
        //creating the pane for holding the rectangle
        Rectangle rectangle=new Rectangle();
        rectangle.setWidth(200);
        rectangle.setHeight(100);
        rectangle.setLayoutX(250);
        rectangle.setLayoutY(50);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        pane.getChildren().add(rectangle);
        
        
        
        //creating the line
        Line line=new Line();
        line.setScaleX(200);
        line.setScaleY(1);
        line.setLayoutX(100);
        line.setLayoutX(500);
        pane.getChildren().add(line);
        
        
        
        //creating scene and placing the pane in it
        r1.setOnAction(this);
        r2.setOnAction(this);
        r3.setOnAction(this);
        r4.setOnAction(this);
        c1.setOnAction(this);
        c2.setOnAction(this);
        c3.setOnAction(this);
        choiceBox.setOnAction(this);
        Scene scene=new Scene(vBox,700,500);
        
        
        
        //setting the title and scene on the stage 
        stage.setTitle("my application");
        stage.setScene(scene);
        stage.setResizable(false);  //false to restrict the scene not to resize
        
        
        //showing the stage
        stage.show();
        
        
        
    }


  //handling the event using event handler
  @Override
  public void handle(ActionEvent ae) {
        //default fw and fp
        FontWeight fw=FontWeight.NORMAL;
        FontPosture fp=FontPosture.REGULAR;
        
        //for radio buttons
        if(r1.isSelected()){
            text.setFill(Paint.valueOf("RED"));
        }
        if(r2.isSelected()){
            text.setFill(Paint.valueOf("BLUE"));
        }
        if(r3.isSelected()){
            text.setFill(Paint.valueOf("GREEN"));
        }
        if(r4.isSelected()){
            text.setFill(Paint.valueOf("MEGANTA"));
        }


        //for checkbox
        if (c1.isSelected()){
            fw=FontWeight.BOLD;
        }
        if (c2.isSelected()){
            fp=FontPosture.ITALIC;
        }
        //setting the text properties
        text.setFont(Font.font("Times New Roma", fw, fp,choiceBox.getValue()));
        throw new UnsupportedOperationException("Unimplemented method 'handle'");
    }
    
    
    
    //main function
    public static void main(String[] args) {
        launch(args);
    }

}
