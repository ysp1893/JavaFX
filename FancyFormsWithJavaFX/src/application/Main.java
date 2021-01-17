/*
 * This tutorial regarding add css styles to JavaFX form 
 */

package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("JavaFX Login Welcome..!!");	//Set Title on Window
			GridPane grid = new GridPane();

			Scene scene = new Scene(grid, 400, 350);
			primaryStage.setScene(scene);
			
			scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
			/*
			 * The style application.css added for main class using scene.
			 */
			
			
			grid.setAlignment(Pos.CENTER);			
			grid.setHgap(10); //Horizontal gap
			grid.setVgap(10); //Vartical gap
			grid.setPadding(new Insets(25, 25, 25, 25)); //Set padding
			Text title = new Text("Welcome..!!"); // Create a title as a text node
			title.setId("Welcome-title");
			//Remove css to apply style from .css file
			//title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));	// Set font-family, font-weight, font-size
			grid.add(title, 0, 0, 2, 1);// 
			
			Label userName = new Label("UserName");
			grid.add(userName, 0, 1);// coloumn 0 and row 1
			
			TextField userTextField = new TextField();
			grid.add(userTextField, 1, 1);
			
			Label password = new Label("Password");
			grid.add(password, 0, 2);
			
			PasswordField passwordField = new PasswordField();
			grid.add(passwordField, 1, 2);
			
			//Create Button
			Button signInBtn = new Button("Sign in");
			
			HBox hbtn = new HBox(10);
			hbtn.setAlignment(Pos.BOTTOM_RIGHT);
			hbtn.getChildren().add(signInBtn);
			grid.add(hbtn, 1, 4); //HBox pane is added to the grid in column 1, row 4.
			
			//Add text control for displaying message
			final Text actionTarget = new Text();
			actionTarget.setId("actionTarget");
			grid.add(actionTarget, 1, 6);			
			signInBtn.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					//Remove css to apply style from .css file
				//	actionTarget.setFill(Color.DARKRED);
					actionTarget.setText("Sign in Button Pressed");
				}
			});
			
			primaryStage.show(); //Use to show the window
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
