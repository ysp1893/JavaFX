# JavaFX

## What is JavaFX?
JavaFX is a Java library used to develop Desktop applications as well as Rich Internet Applications (RIA). The applications built in JavaFX, can run on multiple platforms including Web, Mobile and Desktops.
JavaFX is intended to replace swing in Java applications as a GUI framework. However, it provides more functionalities than swing. Like Swing, JavaFX also provides its own components and doesn't depend upon the operating system. It is lightweight and hardware accelerated. It supports various operating systems including Windows, Linux and Mac OS.

## Features of JavaFX

Features | Description
------------- | ---------------------------------
Content from cell 1 | Content from cell 2
Content in the first column | Content in the second column
Java Library	| It is a Java library which consists of many classes and interfaces that are written in Java.
FXML | 	FXML is the XML based Declarative markup language. The coding can be done in FXML to provide the more enhanced GUI to the user.
Scene Builder |	Scene Builder generates FXML mark-up which can be ported to an IDE.
Web view	| Web pages can be embedded with JavaFX applications. Web View uses WebKitHTML technology to embed web pages.
Built in UI controls	| JavaFX contains Built-in components which are not dependent on operating system. The UI component are just enough to develop a full featured application.
CSS like styling	| JavaFX code can be embedded with the CSS to improve the style of the application. We can enhance the view of our application with the simple knowledge of CSS.
Canvas API	| Canvas API provides the methods for drawing directly in an area of a JavaFX scene.
Rich Set of APIs	| JavaFX provides a rich set of API's to develop GUI applications.
Integrated Graphics Library	| An integrated set of classes are provided to deal with 2D and 3D graphics.
Graphics Pipeline	| JavaFX graphics are based on Graphics rendered pipeline (prism). It offers smooth graphics which are hardware accelerated.
High Performance Media Engine	| The media pipeline supports the playback of web multimedia on a low latency. It is based on a Gstreamer Multimedia framework.
Self-contained application deployment model	| Self-Contained application packages have all of the application resources and a private copy of Java and JavaFX Runtime.

## First JavaFX program:
I am considaring that you have install JavaFx plugins in eclipse or whatever IDE you are using.

```
package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello World!");
		Button btn = new Button();
		btn.setText("Say 'Hello World'");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello World!");
			}
		});

		StackPane root = new StackPane();
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}

```

- Here are the important things to know about the basic structure of a JavaFX application:
   - The main class for a JavaFX application extends the javafx.application.Application class. The start() method is the main entry point for all JavaFX applications.
   - A JavaFX application defines the user interface container by means of a stage and a scene. The JavaFX Stage class is the top-level JavaFX container. The JavaFX Scene class is the container for all content.
   - In JavaFX, the content of the scene is represented as a hierarchical scene graph of nodes. In this example, the root node is a StackPane object, which is a resizable layout node. This means that the root node's size tracks the scene's size and changes when the stage is resized by a user.
   - The root node contains one child node, a button control with text, plus an event handler to print a message when the button is pressed.
   - The main() method is not required for JavaFX applications when the JAR file for the application is created with the JavaFX Packager tool, which embeds the JavaFX Launcher in the JAR file.
   - However, it is useful to include the main() method so you can run JAR files that were created without the JavaFX Launcher, such as when using an IDE in which the JavaFX tools are not fully integrated. Also, Swing applications that embed JavaFX code require the main() method.
