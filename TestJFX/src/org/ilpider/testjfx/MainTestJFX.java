package org.ilpider.testjfx;

import org.ilpider.testjfx.view.ControllerRoot;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;

public class MainTestJFX extends Application {

	private Stage primaryStage;
	private BorderPane layoutRoot;
	private ControllerRoot controllerLayoutRoot;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("TestJFX");

		inizializzaLayoutRoot();
	}

	public void inizializzaLayoutRoot() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainTestJFX.class
					.getResource("view/LayoutRoot.fxml"));
			layoutRoot = loader.load();

			controllerLayoutRoot = loader.getController();
			controllerLayoutRoot.setMainTestJFX(this);

			Scene scene = new Scene(layoutRoot);
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
		layoutRoot.setCenter(layoutGiocatori);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
