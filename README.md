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

First Project link: https://github.com/ysp1893/JavaFX/tree/main/FirstJavaFXProject

# Understanding the JavaFX Architecture

![Image of JavaFX Architect](https://github.com/ysp1893/Images-Required/blob/master/JavaFxArchitecture.png?raw=true)

## Scene Graph:
It is the starting point for constructing a JavaFX application. It is a hierarchical tree of nodes that represents all of the visual elements of the application's user interface. It can handle input and can be rendered. A single element in a scene graph is called a node. Each node has an ID, style class, and bounding volume. With the exception of the root node of a scene graph, each node in a scene graph has a single parent and zero or more children. It can also have the Effects, such as blurs and shadows, opacity, transform, Event handlers (such as mouse, key and input method), etc.
The JavaFX scene graph also includes the graphics primitives, such as rectangles and text, in addition to having controls, layout containers, images and media.
The javafx.scene API allows the creation and specification of several types of content, such as:
- Nodes: Shapes (2-D and 3-D), images, media, embedded web browser, text, UI controls, charts, groups, and containers
- State: Transforms (positioning and orientation of nodes), visual effects, and other visual state of the content
- Effects: Simple objects that change the appearance of scene graph nodes, such as blurs, shadows, and color adjustment

## Java Public APIs for JavaFX Features:
Java public APIs support rich client application development. These APIs provide unparalleled freedom and flexibility to construct rich client applications. The JavaFX platform combines the best capabilities of the Java platform with comprehensive, immersive media functionality into an intuitive and comprehensive one-stop development environment.

## Graphics System:
It  is an implementation detail beneath the JavaFX scene graph layer. It supports both 2-D and 3-D scene graphs. It provides software rendering when the graphics hardware on a system is insufficient to support hardware accelerated rendering.
Two graphics accelerated pipelines are implemented on the JavaFX platform: **prism and Quantum Toolkit**

## Glass Windowing Toolkit
It  is the lowest level in the JavaFX graphics stack. Its main responsibility is to provide native operating services, such as managing the windows, timers, and surfaces. It serves as the platform-dependent layer that connects the JavaFX platform to the native operating system.

## Media and Images
JavaFX media functionality is available through the javafx.scene.media APIs. JavaFX supports both visual and audio media. Support is provided for MP3, AIFF, and WAV audio files and FLV video files. JavaFX media functionality is provided as three separate components: the Media object represents a media file, the MediaPlayer plays a media file, and a MediaView is a node that displays the media.

## Web Component
The Web component is a JavaFX UI control, based on Webkit, that provides a Web viewer and full browsing functionality through its API. This Web Engine component is based on WebKit, which is an open source web browser engine that supports HTML5, CSS, JavaScript, DOM, and SVG.
This embedded browser component is composed of the following classes:
- WebEngine provides basic web page browsing capability.
- WebView encapsulates a WebEngine object, incorporates HTML content into an application's scene, and provides fields and methods to apply effects and transformations. It is an extension of a Node class.
In addition, Java calls can be controlled through JavaScript and vice versa to allow developers to make the best of both environments.

## css
JavaFX Cascading Style Sheets (CSS) provides the ability to apply customized styling to the user interface of a JavaFX application without changing any of that application's source code. CSS can be applied to any node in the JavaFX scene graph and are applied to the nodes asynchronously. JavaFX CSS styles can also be easily assigned to the scene at runtime, allowing an application's appearance to dynamically change.
JavaFX CSS is based on the W3C CSS version 2.1 specifications, with some additions from current work on version 3. The JavaFX CSS support and extensions have been designed to allow JavaFX CSS style sheets to be parsed cleanly by any compliant CSS parser, even one that does not support JavaFX extensions. This enables the mixing of CSS styles for JavaFX and for other purposes (such as for HTML pages) into a single style sheet. All JavaFX property names are prefixed with a vendor extension of ”-fx-”, including those that might seem to be compatible with standard HTML CSS, because some JavaFX values have slightly different semantics.

## UI Controls
The JavaFX UI controls available through the JavaFX API are built by using nodes in the scene graph. They can take full advantage of the visually rich features of the JavaFX platform and are portable across different platforms. JavaFX CSS allows for theming and skinning of the UI controls.

## Layout
Layout containers or panes can be used to allow for flexible and dynamic arrangements of the UI controls within a scene graph of a JavaFX application. The JavaFX Layout API includes the following container classes that automate common layout models

## 2-D and 3-D Transformations
Each node in the JavaFX scene graph can be transformed in the x-y coordinate using the following javafx.scene.tranform classes:
- translate – Move a node from one place to another along the x, y, z planes relative to its initial position.
- scale – Resize a node to appear either larger or smaller in the x, y, z planes, depending on the scaling factor.
- shear – Rotate one axis so that the x-axis and y-axis are no longer perpendicular. The coordinates of the node are shifted by the specified multipliers.
- rotate – Rotate a node about a specified pivot point of the scene.
- affine – Perform a linear mapping from 2-D/3-D coordinates to other 2-D/3-D coordinates while preserving the 'straight' and 'parallel' properties of the lines. This class should be used with Translate, Scale, Rotate, or Shear transform classes instead of being used directly.

## Visual Effects
The development of rich client interfaces in the JavaFX scene graph involves the use of Visual Effects or Effects to enhance the look of JavaFX applications in real time. The JavaFX Effects are primarily image pixel-based and, hence, they take the set of nodes that are in the scene graph, render it as an image, and apply the specified effects to it.
Some of the visual effects available in JavaFX include the use of the following classes:
- Drop Shadow – Renders a shadow of a given content behind the content to which the effect is applied.
- Reflection – Renders a reflected version of the content below the actual content.
- Lighting – Simulates a light source shining on a given content and can give a flat object a more realistic, three-dimensional appearance.

