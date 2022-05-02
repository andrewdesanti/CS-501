package javafx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.scene.Scene;

public class DeSanti14_1 extends Application{
	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {
		//load pictures
		Image i1 = new Image(new FileInputStream("/home/andy/eclipse-workspace/javafx/src/javafx/blue.png"));
		Image i2 = new Image(new FileInputStream("/home/andy/eclipse-workspace/javafx/src/javafx/green.jpg"));
		Image i3 = new Image(new FileInputStream("/home/andy/eclipse-workspace/javafx/src/javafx/red.png"));
		Image i4 = new Image(new FileInputStream("/home/andy/eclipse-workspace/javafx/src/javafx/yellow.png"));
		
		//create the grid
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(5));
		grid.setVgap(10);
		grid.setHgap(10);
		
		//display images
		ImageView green = new ImageView(i1);
		ImageView red = new ImageView(i2);
		ImageView blue = new ImageView(i3);
		ImageView yellow = new ImageView(i4);
		
		//align images in grid
		grid.add(green, 0, 0);
		grid.add(red, 0, 1);
		grid.add(blue, 1, 0);
		grid.add(yellow, 1, 1);
		
		//create and display the scene
		Scene s = new Scene(grid);
		primaryStage.setScene(s);
		primaryStage.show();
	}
	
	//main to actually call running the application
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	
	
}
