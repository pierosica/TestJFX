package org.ilpider.testjfx;

import org.ilpider.testjfx.model.Giocatore;
import org.ilpider.testjfx.model.Partita;
import org.ilpider.testjfx.view.TestJFXController;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

	private BorderPane root;
	private static TestJFXController controller;
	private Giocatore model;
	private static Partita partita;

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("view/TestJFX.fxml"));
			root = loader.load();

			model = new Giocatore("Pluto", 0);
			controller = loader.getController();
			controller.setModel(model);
			int numeroGiocatori= controller.getNumeroGiocatori();
			nuovaPartita(numeroGiocatori);
			controller.setPartita(partita);
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

	public static void main(String[] args) {
		launch(args);
	}

	public static Partita getPartita() {
		return partita;
	}

	public void setPartita(Partita partita) {
		Main.partita = partita;
	}
	
	public static  void nuovaPartita(int numeroGiocatori){
		partita=new Partita(numeroGiocatori);
		controller.setPartita(partita);
	}
}
