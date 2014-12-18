package org.ilpider.testjfx;

import java.util.List;

import org.ilpider.testjfx.model.Giocatore;
import org.ilpider.testjfx.model.Partita;
import org.ilpider.testjfx.view.TestJFXController;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;

public class MainTestJFX extends Application {

	private Stage primaryStage;
	private BorderPane root;
	private TestJFXController controller;
	private Partita partita;
	private Giocatore model;
	private int numeroGiocatori = 0;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("TestJFX");

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainTestJFX.class
					.getResource("view/TestJFX.fxml"));
			root = loader.load();

			// model = new Giocatore("Pluto", 0);
			controller = loader.getController();
			controller.setMainTestJFX(this);
			controller.setModel(model);
			numeroGiocatori = controller.getNumeroGiocatori();
			nuovaPartita(numeroGiocatori);
			controller.setPartita(partita);

			creaLayout();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(
					getClass().getResource("view/application.css")
							.toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

			creaLayout();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}

	public Partita getPartita() {
		return partita;
	}

	public void nuovaPartita(int numeroGiocatori) {
		partita = new Partita(numeroGiocatori);
		controller.setPartita(partita);
		System.out.println(partita);

		List<Giocatore> giocatori = partita.listGiocatori(numeroGiocatori);
		for (Giocatore g : giocatori) {
			System.out.println(g.getNome());
		}
	}

	public void creaLayout() {
		for (int i = 0; i < numeroGiocatori; i++) {
			try {
				// Load person overview.
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainTestJFX.class
						.getResource("view/Giocatore.fxml"));
				BorderPane giocatoreLayout = (BorderPane) loader.load();
				// Set person overview into the center of root layout.
				root.setCenter(giocatoreLayout);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
