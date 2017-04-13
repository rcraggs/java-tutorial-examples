package tutorial;
	
import java.util.Calendar;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.*;
import javafx.geometry.Insets;

public class Main extends Application {
	
	@Override
	
	// Q? Why is our stuff in "start" not in main?
	public void start(Stage primaryStage) {

		// Create the vbox which is a expanding vertical container for our controls
		VBox vbox = new VBox();
		vbox.setPadding(new Insets(10,10,10,10));
		vbox.setSpacing(10);
		
		// Create a scene of the vbox and add it to the stage
		Scene scene = new Scene(vbox,400,150);		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		// Add controls to the vbox
		Button setTaskButton = new Button("Set Current Task");
		Label taskLabel = new Label();
		
		vbox.getChildren().add(new TextField(""));
		vbox.getChildren().add(setTaskButton);
		vbox.getChildren().add(taskLabel);

		setTaskButton.setOnAction(e -> { 
			taskLabel.setText("The task is updated at " + Calendar.getInstance().getTime());
		} );
	}
	
	public static void main(String[] args) {
		launch(args); // Q? What is launch
	}
	
}
