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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("JavaFX Login Welcome..!!");	//Set Title on Window
			
			//GridPane lays out its children within a flexible grid of rows and columns. 
			//If a border and/or padding is set, then its content will be layed out within those insets. 
			//A child may be placed anywhere within the grid and may span multiple rows/columns. 
			//Children may freely overlap within rows/columns and their stacking order will be defined by the order of the gridpane's children list (0th node in back, last node in front).
			GridPane grid = new GridPane();

			//The scene is created with the grid pane as the root node, which is a common practice when working with layout containers. 
			//Thus, as the window is resized, the nodes within the grid pane are resized according to their layout constraints
			Scene scene = new Scene(grid, 400, 350);
			primaryStage.setScene(scene);
			
			//Sets the value of the property alignment.
			//Property description: 
			//The alignment of of the grid within the gridpane's width and height.
			//Set alignment at CENTER
			grid.setAlignment(Pos.CENTER);
			
			grid.setHgap(10); //Horizontal gap
			grid.setVgap(10); //Vartical gap
			grid.setPadding(new Insets(25, 25, 25, 25)); //Set padding
			//This code sets the scene width and height to 300 by 275. 
			//If you do not set the scene dimensions, the scene defaults to the minimum size needed to display its contents.
			
			Text title = new Text("Welcome..!!"); // Create a title as a text node
			title.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));	// Set font-family, font-weight, font-size
			
			//title is added in column 0, row 0. 
			//The last two arguments of the grid.add() method set the column span to 2 and the row span to 1.
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
			
			//creates an HBox layout pane named hbBtn with spacing of 10 pixels. 
			//The HBox pane sets an alignment for the button that is different from the alignment 
			//applied to the other controls in the grid pane.
			HBox hbtn = new HBox(10);
			hbtn.setAlignment(Pos.BOTTOM_RIGHT);
			hbtn.getChildren().add(signInBtn);
			grid.add(hbtn, 1, 4); //HBox pane is added to the grid in column 1, row 4.
			
			//Add text controll for displaying message
			final Text actionTarget = new Text();
			grid.add(actionTarget, 1, 6);
			
			//Add Action on sign-in button press for display actionTarget Text
			//The setOnAction() method is used to register an event handler 
			//that sets the actiontarget object to Sign in button pressed
			signInBtn.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent arg0) {
					actionTarget.setFill(Color.INDIANRED);
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
