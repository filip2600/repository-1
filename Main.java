package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;



public class Main extends Application {
	
	Button poczatek=new Button("Start");
	public void start(Stage primaryStage) {
			Pane root = new Pane();
			Scene scene = new Scene(root,200,200);
			
			
			root.getChildren().add(poczatek);
			poczatek.setTranslateX(62);
			poczatek.setTranslateY(50);
		   poczatek.setMinSize(70, 70);
			
		   dodajakcje(primaryStage);
			primaryStage.close();
			primaryStage.setScene(scene);
			primaryStage.show();
			
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void dodajakcje(Stage glowne)
	{
		poczatek.setOnAction(new EventHandler<ActionEvent>() {
			
			
			public void handle(ActionEvent event) {
				
			  
				Drugieokno d=new Drugieokno();
				d.stworz();
				glowne.close();
				
				
				
				
			}
		});
		
	}
}


