import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DeSanti14_12 extends Application{
	public static void main(String[] args) {
		  Application.launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
	//create the pane to sit on
	Pane pane = new Pane();
	
	//create to scale rectangles...
	Rectangle pro = new Rectangle(10,65,60,40);
	pro.setFill(Color.RED);	
	Rectangle q = new Rectangle(80,85,60,20);
	q.setFill(Color.BLUE);
	Rectangle mid = new Rectangle(150,45,60,60);
	mid.setFill(Color.GREEN);
	Rectangle fin = new Rectangle(220,25,60,80);
	fin.setFill(Color.ORANGE);
	
	//create text labels
	Text tpro = new Text(10,55, "20% Project");
	Text tq = new Text(80,75, "10% Quiz");
	Text tmid = new Text(140,35, "30% Midterm");
	Text tfin = new Text(220,15, "40% Final");
	
	//add rectangles to pane
	pane.getChildren().add(pro);	
	pane.getChildren().add(q);	
	pane.getChildren().add(mid);	
	pane.getChildren().add(fin);	

	//add text to pane
	pane.getChildren().add(tpro);
	pane.getChildren().add(tq);
	pane.getChildren().add(tmid);
	pane.getChildren().add(tfin);

	//create the scene to show
	Scene s = new Scene(pane, 350, 150);
	primaryStage.setScene(s);
	primaryStage.show();
	}
	
}
