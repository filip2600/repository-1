package application;

import javafx.application.Application;
import javafx.scene.image.ImageView;

import java.awt.*;
import java.awt.TrayIcon.MessageType;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


import java.util.Timer;
import java.util.TimerTask;





public class Drugieokno {
	
	 TextField ileczasu=new TextField();
	Stage okno=new Stage();
	 int i=0;
	 
	public void stworz()
	{
		
		Pane root2=new Pane();
		Scene scena=new Scene(root2,300,300);
		Button ok=new Button("OK");
	   root2.getChildren().add(ok);
	   ok.setTranslateX(200);
       ok.setTranslateY(50);	   
		
       
       root2.getChildren().add(ileczasu);
       ileczasu.setTranslateX(50);
       ileczasu.setTranslateY(50);
       
       Label napis=new Label("Podaj co ile ma byc przerwa w sekundach.");
       root2.getChildren().add(napis);
       napis.setTranslateY(35);
       
       ImageView obraz=new ImageView("/obrazy/londyn8.jpg");
       obraz.setFitHeight(150);
       obraz.setFitWidth(150);
       root2.getChildren().add(obraz);
       obraz.setTranslateX(50);
       obraz.setTranslateY(100);
      
       
       
       
       
      
       
	
		
       
       
       
       
       
		ok.setOnAction(new EventHandler<ActionEvent>() {

		   
			public void handle(ActionEvent event) {
				ustawienieczasu();
				
			}
		});
		
		
		okno.setScene(scena);
		okno.show();
		
	}
	
	public void ustawienieczasu()
	{
		//ustawiam co ile na podsawie linijki
		int f=Integer.parseInt(ileczasu.getText());
		System.out.println(f);		
		Timer timer=new Timer();
		okno.close();
		timer.scheduleAtFixedRate(new TimerTask() {
			
			
			public void run() {
				
				System.out.println("halko"+i);
				 SystemTray tray = SystemTray.getSystemTray();
				   Image obrazek=Toolkit.getDefaultToolkit().createImage("/obrazy/kolko.jpg/");
				   TrayIcon ikonka=new TrayIcon(obrazek,"Costam");
				   ikonka.setImageAutoSize(true);
				   ikonka.setToolTip("jakis tekst");
				 try {
					tray.add(ikonka);
					ikonka.displayMessage("Przerwa", "Zrob sobie przerwe! ", MessageType.WARNING);
				
				} catch (AWTException e) {
					
					e.printStackTrace();
			}
				   
				  
				 
				  
				
				if(i==6)
				{
					
					System.out.println("Weszlow6");
						System.exit(0);
						timer.cancel();
						
					

					
					
				}
				i++;
			}
		}, 0, f*1000);
	}

}


//poczytac o xml

//dodac obrazek straznika czasu
//wprowadzic ograniczenia tylko na liczby w  Stringield
//i rozne od 0