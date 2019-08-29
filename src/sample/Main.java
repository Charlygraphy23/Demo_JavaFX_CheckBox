package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.util.EventListener;

public class Main extends Application implements EventHandler {

    private Label question,result,details;

    private CheckBox apple,mango,banana,pinapple;
    private String fruits;

    @Override
    public void start(Stage primaryStage) throws Exception{
      primaryStage.setTitle("Check Box");
        FlowPane pane=new FlowPane(10,10);
        pane.setOrientation(Orientation.VERTICAL);
        pane.setAlignment(Pos.CENTER);

      question=new Label("Which you want to Choose ?");
        result=new Label();
        details=new Label();


        apple=new CheckBox("Apple");
        mango=new CheckBox("Mango");
        banana=new CheckBox("Banana");
        pinapple=new CheckBox("Pinapple");

        apple.setOnAction(this);
        mango.setOnAction(this);
        banana.setOnAction(this);
        pinapple.setOnAction(this);



        pane.getChildren().add(question);
        pane.getChildren().addAll(apple,mango,banana,pinapple);
        pane.getChildren().addAll(result,details);
      Scene scene=new Scene(pane,400,500);
      primaryStage.setScene(scene);
      primaryStage.show();

      getDetails();
    }

    private void getDetails() {
        fruits="";
        if(apple.isSelected())fruits += " Apple";
        if(mango.isSelected())fruits += " Mango";
        if(banana.isSelected())fruits += " Banana";
        if(pinapple.isSelected())fruits += " Pinapple";

        details.setText(fruits);
    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(Event event) {
        Object selectedItem=event.getSource();

        if(apple.equals(selectedItem)){
            if(apple.isSelected()){
                result.setText("Apple Selected");
            }
            else {
                result.setText("Apple Uncheked");
            }
            getDetails();
        }

        if(mango.equals(selectedItem)){
            if(mango.isSelected()){
                result.setText("Mango Selected");
            }
            else {
                result.setText("Mango Uncheked");
            } getDetails();
        }

        if(banana.equals(selectedItem)){
            if(banana.isSelected()){
                result.setText("Banana Selected");
            }
            else {
                result.setText("Banana Uncheked");
            } getDetails();
        }

        if(pinapple.equals(selectedItem)){
            if(pinapple.isSelected()){
                result.setText("Pinapple Selected");
            }
            else {
                result.setText("Pinapple Uncheked");
            } getDetails();
        }
    }
}
