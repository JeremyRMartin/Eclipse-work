package helloworld;
 
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class HelloWorld extends Application {
	
	
    @Override
    public void start(Stage primaryStage) {
    	//Initiate Buttons
        Button btn1 = new Button();
        Button btn2 = new Button();
        
        //Set Button Texts
        btn1.setText("Continue...?");
        btn2.setText("No Thanks.");
        
        //Set Button Locations
        btn1.setTranslateX(-45);
        btn1.setTranslateY(180);
        btn2.setTranslateX(45);
        btn2.setTranslateY(180);
        
        //What happens when you press Button 1
        btn1.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent continueEvent) {
                System.out.println("Thanks for Entering, Welcome.");
            }
        });
        
        //What happens when you press Button 2
        btn2.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent noThanksEvent) {
                System.out.println("Go on, Scram!");
            }
        });
        
        
        StackPane root = new StackPane();
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);

 Scene scene = new Scene(root, 600, 500);

        primaryStage.setTitle("Integration Project");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 public static void main(String[] args) {
        launch(args);
    }

}