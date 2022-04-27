package main;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Assignment1 extends Application{

	ArrayList<String> listeAL = new ArrayList<String>();
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception{
		primaryStage.setTitle("Title");
		
	    for ( int i=0; i<100; i++ ) {
	        listeAL.add("Textmessage " + i);
	    }
		
		ObservableList<String> listeOL = FXCollections.observableList(listeAL);
		
		GridPane grid = new GridPane();
		Scene scene = new Scene(grid, 300, 250);
		
	    ListView<String> ListView = new ListView<>();
		
	    ListView.setItems(listeOL);
	    VBox ListBox = new VBox();
	    ListBox.getChildren().addAll(ListView);
	    grid.add(ListBox, 50, 30, 10, 10);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Assignment Singleton");  
		primaryStage.show();
	}
}

