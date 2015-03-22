package org.ilpider.testjfx;

//import java.util.List;
//
//import org.ilpider.testjfx.model.Giocatore;
//import org.ilpider.testjfx.model.Partita;
import org.ilpider.testjfx.view.TestJFXController;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;

public class MainTestJFX extends Application {

	private Stage primaryStage;
	private BorderPane root;
	private TestJFXController controllerRoot;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("TestJFX");

		inizializzaRoot();
	}

	public void inizializzaRoot() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainTestJFX.class
					.getResource("view/TestJFX.fxml"));
			root = loader.load();

			controllerRoot = loader.getController();
			controllerRoot.setMainTestJFX(this);

			Scene scene = new Scene(root);
			scene.getStylesheets().add(
					getClass().getResource("view/application.css")
							.toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void inizializzaLayoutGiocatori(GridPane layoutGiocatori) {
		root.setCenter(layoutGiocatori);
	}

	public static void main(String[] args) {
		launch(args);
	}

	public BorderPane getRoot() {
		return root;
	}

}
